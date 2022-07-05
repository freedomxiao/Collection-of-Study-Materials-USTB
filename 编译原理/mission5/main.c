#include "RemoveLeftRecursion.h"
#include <string.h>
#include <stdlib.h>

const char *VoidSymbol = "$"; // "ε"
const char *Postfix = "'";

char rule_table_ci[20][256];
char ruleNameArr[20][64];
void FreeSelect(RuleSymbol *pSelect)
{
	if (pSelect == NULL)
	{
		return;
	}
	FreeSelect(pSelect->pNextSymbol);
	free(pSelect);
	return;
}

/*
功能：
	释放所有 Rule 的内存。
参数：
	pRule -- 所有 Rule 的头指针。
*/
void FreeRule(Rule *pRule)
{
	if (pRule == NULL)
	{
		return;
	}
	FreeRule(pRule->pNextRule);
	RuleSymbol *pCurSelect = pRule->pFirstSymbol, *pNxtSelect;
	while (pCurSelect)
	{
		pNxtSelect = pCurSelect->pOther;
		FreeSelect(pCurSelect);
		pCurSelect = pNxtSelect;
	}
	free(pRule);
	return;
}
int main(int argc, char *argv[])
{
	//
	// 调用 InitRules 函数初始化文法
	//

#ifdef CODECODE_CI
	Rule *pHead = InitRules_CI(); // 此行代码在线上流水线运行
#else
	Rule *pHead = InitRules(); // 此行代码在 CP Lab 中运行
#endif

	//
	// 输出消除左递归之前的文法
	//
	printf("Before Remove Left Recursion:\n");
	PrintRule(pHead);

	//
	// 调用 RemoveLeftRecursion 函数消除文法中的左递归
	//
	RemoveLeftRecursion(pHead);

	//
	// 输出消除左递归之后的文法
	//
	printf("\nAfter Remove Left Recursion:\n");
	PrintRule(pHead);
	FreeRule(pHead);
	return 0;
}

/*
功能：
	判断当前 Rule 中的一个 Symbol 是否需要被替换。
	如果 Symbol 是一个非终结符，且 Symbol 对应的
	Rule 在当前 Rule 之前，就需要被替换。

参数：
	pCurRule -- 当前 Rule 的指针。
	pSymbol -- Symbol 指针。
	  
返回值：
	需要替换返回 1。
	不需要替换返回 0。
*/
int SymbolNeedReplace(const Rule *pCurRule, const RuleSymbol *pSymbol)
{
	// 如果当前 Symbol 是终结符的话，就一定不需要替换
	if (pSymbol->isToken == 1)
	{
		return 0;
	}
	Rule *p = pCurRule;
	// 遍历在当前 Rule 之前已经被处理的 Rule
	while (p != NULL)
	{
		// 在当前 Rule 之后，不需要被替换
		if (p == pSymbol->pRule)
		{
			return 0;
		}
		p = p->pNextRule;
	}
	return 1;
	//
	// TODO: 在此添加代码
	//
}

/*
功能：
	拷贝一个 Symbol。

参数：
	pSymbolTemplate -- 需要被拷贝的 Symbol 指针。
	  
返回值：
	拷贝获得的新 Symbol 的指针。
*/
RuleSymbol *CopySymbol(const RuleSymbol *pSymbolTemplate)
{
	if (pSymbolTemplate == NULL)
	{
		return NULL;
	}
	// 创建新 Symbol
	RuleSymbol *newSymbol = CreateSymbol();

	newSymbol->pNextSymbol = pSymbolTemplate->pNextSymbol;
	newSymbol->pOther = pSymbolTemplate->pOther;
	newSymbol->isToken = pSymbolTemplate->isToken;
	strcpy(newSymbol->TokenName, pSymbolTemplate->TokenName);
	newSymbol->pRule = pSymbolTemplate->pRule;
	return newSymbol;
	//
	// TODO: 在此添加代码
	//
}

/*
功能：
	拷贝一个 Select。

参数：
	pSelectTemplate -- 需要被拷贝的 Select 指针。
	  
返回值：
	拷贝获得的新 Select 的指针。
*/
RuleSymbol *CopySelect(const RuleSymbol *pSelectTemplate)
{
	RuleSymbol *pNewSymbol = CopySymbol(pSelectTemplate);
	RuleSymbol *temp = pNewSymbol;
	while (temp->pNextSymbol != NULL)
	{ //copy每一个
		temp->pNextSymbol = CopySymbol(temp->pNextSymbol);
		temp = temp->pNextSymbol;
	}
	return pNewSymbol;
	//
	// TODO: 在此添加代码
	//
}

/*
功能：
	替换一个 Select 的第一个 Symbol。

参数：
	pSelectTemplate -- 需要被替换的 Select 指针。
	  
返回值：
	替换后获得的新 Select 的指针。
	注意，替换后可能会有一个新的 Select，
	也可能会有多个 Select 链接在一起。
*/
RuleSymbol *ReplaceSelect(const RuleSymbol *pSelectTemplate)
{
	// pSelectTemplate下一个pRule
	Rule *pRule = pSelectTemplate->pRule;
	// 新的Select
	RuleSymbol *pNewSelect = CopySelect(pRule->pFirstSymbol);
	RuleSymbol *pTempSelect = pRule->pFirstSymbol;
	RuleSymbol *pTempSymbol;

	RuleSymbol *pCurSelect = pNewSelect;
	while (pTempSelect->pOther != NULL)
	{ // copy所有select到RuleSymbol
		pCurSelect->pOther = CopySelect(pTempSelect->pOther);
		pCurSelect = pCurSelect->pOther;
		pTempSelect = pTempSelect->pOther;
	}
	pTempSelect = pNewSelect;
	//
	while (pTempSelect != NULL)
	{
		pTempSymbol = pTempSelect;
		while (pTempSymbol->pNextSymbol != NULL) //到结束
		{
			pTempSymbol = pTempSymbol->pNextSymbol;
		}
		pTempSymbol->pNextSymbol = CopySymbol(pSelectTemplate->pNextSymbol);
		pTempSelect = pTempSelect->pOther;
	}

	return pNewSelect;
	//
	// TODO: 在此添加代码
	//
}

/*
功能：
	判断一条 Rule 是否存在左递归。

参数：
	prRule -- Rule 指针。
	  
返回值：
	存在返回 1。
	不存在返回 0。
*/
int RuleHasLeftRecursion(Rule *pRule)
{
	RuleSymbol *pCurSelect = pRule->pFirstSymbol;
	while (pCurSelect != NULL)
	{
		if (pCurSelect->isToken == 0 && pCurSelect->pRule == pRule)
		{ //相等则存在
			return 1;
		}
		pCurSelect = pCurSelect->pOther;
	}
	//
	// TODO: 在此添加代码
	//
}

/*
功能：
	将一个 Symbol 添加到 Select 的末尾。

参数：
	pSelect -- Select 指针。
	pNewSymbol -- Symbol 指针。
*/
void AddSymbolToSelect(RuleSymbol *pSelect, RuleSymbol *pNewSymbol)
{
	RuleSymbol *pTempSymbol = pSelect;
	// 到symbol尾部
	while (pTempSymbol->pNextSymbol != NULL)
	{
		pTempSymbol = pTempSymbol->pNextSymbol;
	}
	// 将Symbol添加到Select尾部
	pTempSymbol->pNextSymbol = pNewSymbol;
	//
	// TODO: 在此添加代码
	//
}

/*
功能：
	将一个 Select 加入到文法末尾，当 Select 为 NULL 时就将一个ε终结符加入到文法末尾。

参数：
	pRule -- 文法指针。
	pNewSelect -- Select 指针。
*/
void AddSelectToRule(Rule *pRule, RuleSymbol *pNewSelect)
{
	RuleSymbol *pTempSelect = pRule->pFirstSymbol;
	if (pTempSelect == NULL)
	{ //空则直接加上
		pRule->pFirstSymbol = pNewSelect;
		return;
	}
	// 到select链表尾部
	while (pTempSelect->pOther != NULL)
	{
		pTempSelect = pTempSelect->pOther;
	}
	// 如果是NULL则添加空字符终结符
	if (pNewSelect == NULL)
	{
		pNewSelect = (RuleSymbol *)malloc(sizeof(RuleSymbol));
		pNewSelect->pNextSymbol = NULL;
		pNewSelect->pOther = NULL;
		pNewSelect->isToken = 1;
		strcpy(pNewSelect->TokenName, VoidSymbol);
	}
	// 将新的select添加到Rule末尾
	pTempSelect->pOther = pNewSelect;
	//
	// TODO: 在此添加代码
	//
}

/*
功能：
	消除左递归。

参数：
	pHead -- 文法链表的头指针。
*/
void RemoveLeftRecursion(Rule *pHead)
{
	Rule *pRule;		 // Rule 游标
	RuleSymbol *pSelect; // Select 游标
	Rule *pNewRule;		 // Rule 指针
	int isChange;		 // Rule 是否被替换的标记

	for (pRule = pHead; pRule != NULL; pRule = pRule->pNextRule)
	{
		//
		// 替换
		//
		RuleSymbol **pSelectPrePtr; // Symbol 指针的指针
		do
		{
			isChange = 0;

			// 在 Rule 的所有 Select 中查找是否需要替换
			for (pSelect = pRule->pFirstSymbol, pSelectPrePtr = &pRule->pFirstSymbol;
				 pSelect != NULL;
				 pSelectPrePtr = &pSelect->pOther, pSelect = pSelect->pOther)
			{
				if (SymbolNeedReplace(pRule, pSelect)) // 判断 Select 的第一个 Symbol 是否需要替换
				{
					isChange = 1;

					// 调用 ReplaceSelect 函数，替换 Select 的第一个 Symbol 后得到新的 Selects
					RuleSymbol *pNewSelects = ReplaceSelect(pSelect);

					// 使用新的 Selects 替换原有的 Select，并调用 FreeSelect 函数释放原有的 Select 内存
					RuleSymbol *pTempSelect = pNewSelects;
					// 找到Selects最后一个select
					while (pTempSelect->pOther != NULL)
					{
						pTempSelect = pTempSelect->pOther;
					}
					// 接上去
					pTempSelect->pOther = pSelect->pOther;
					// 前一个select末尾连接新的selects
					*pSelectPrePtr = pNewSelects;
					pTempSelect = pSelect;
					pSelect = pNewSelects;
					// 释放内存
					FreeSelect(pTempSelect);
					//
					// TODO: 在此添加代码
					//

					break;
				}

				if (isChange)
				{
					break;
				}
			}
		} while (isChange);

		// 忽略没有左递归的 Rule;
		if (RuleHasLeftRecursion(pRule)==NULL)
		{
			continue;
		}

		//
		// 消除左递归
		//
		pNewRule = CreateRule(pRule->RuleName); // 创建新 Rule
		strcat(pNewRule->RuleName, Postfix);

		pSelect = pRule->pFirstSymbol; // 初始化 Select 游标
		pSelectPrePtr = &pRule->pFirstSymbol;
		while (pSelect != NULL) // 循环处理所有的 Select
		{
			if (0 == pSelect->isToken && pSelect->pRule == pRule) // Select 存在左递归
			{
				// 移除包含左递归的 Select，将其转换为右递归后添加到新 Rule 的末尾，并移动游标
				// 创建一个select
				RuleSymbol *pTempSelect = CopySelect(pSelect->pNextSymbol);
				RuleSymbol *NewSymbol = CreateSymbol(), *pTemp;
				// 将前一个select的指针指向后一个select （删除当前select）
				*pSelectPrePtr = pTempSelect;
				// 将NewSymbol指向NewRule
				NewSymbol->isToken = 0;
				NewSymbol->pRule = pNewRule;
				// 将指向新rule的symbol加入select中
				AddSymbolToSelect(pTempSelect, NewSymbol);
				pTempSelect->pOther = NULL;
				// 将当前select加入新的rule
				AddSelectToRule(pNewRule, pTempSelect);
				pTemp = pSelect;
				// 移动指针
				*pSelectPrePtr = pSelect->pOther;
				pSelect = pSelect->pOther;
				// 释放内存
				FreeSelect(pTemp);

				//
				// TODO: 在此添加代码
				//
			}
			else // Select 不存在左递归
			{
				// 在没有左递归的 Select 末尾添加指向新 Rule 的非终结符，并移动游标
				// 创建新终结符指向它
				RuleSymbol *pNewSymbol = CreateSymbol();
				pNewSymbol->isToken = 0;
				pNewSymbol->pRule = pNewRule;
				// 加入到当前select末尾
				AddSymbolToSelect(pSelect, pNewSymbol);
				pSelectPrePtr = &pSelect->pOther;
				pSelect = pSelect->pOther;
				//
				// TODO: 在此添加代码
				//
			}
		}

		// 在新 Rule 的最后加入ε(用 '$' 代替)
		// 将新 Rule 插入文法链表
		AddSelectToRule(pNewRule, NULL);
		pNewRule->pNextRule = pRule->pNextRule;
		pRule->pNextRule = pNewRule;
		pRule = pNewRule;
		//
		// TODO: 在此添加代码
		//
	}
}

/*
功能：
	使用给定的数据初始化文法链表

返回值：
	Rule 指针
*/
typedef struct _SYMBOL
{
	int isToken;
	char Name[MAX_STR_LENGTH];
} SYMBOL;

typedef struct _RULE_ENTRY
{
	char RuleName[MAX_STR_LENGTH];
	SYMBOL Selects[64][64];
} RULE_ENTRY;

static const RULE_ENTRY rule_table[] =
{
	/* A -> Ba | Aa | c */
	{ "A", 
			{
				{ { 0, "B" }, { 1, "a"} },
				{ { 0, "A" }, { 1, "a"} },
				{ { 1, "c" } }
			}	
	},

	/* B -> Bb | Ab | d */
	{ "B", 
			{
				{ { 0, "B" }, { 1, "b"} },
				{ { 0, "A" }, { 1, "b"} },
				{ { 1, "d" } }
			}	
	}
};

/*
功能：
	初始化文法链表。
	
返回值：
	文法的头指针。
*/
Rule *InitRules()
{
	Rule *pHead, *pRule;
	RuleSymbol **pSymbolPtr1, **pSymbolPtr2;
	int nRuleCount = sizeof(rule_table) / sizeof(rule_table[0]);
	int i, j, k;

	Rule **pRulePtr = &pHead;
	for (i = 0; i < nRuleCount; i++)
	{
		// 根据name创建rule
		*pRulePtr = CreateRule(rule_table[i].RuleName);
		// 移动rule指针
		pRulePtr = &(*pRulePtr)->pNextRule;
	}

	pRule = pHead;
	for (i = 0; i < nRuleCount; i++)
	{
		pSymbolPtr1 = &pRule->pFirstSymbol;
		for (j = 0; rule_table[i].Selects[j][0].Name[0] != '\0'; j++)
		{
			pSymbolPtr2 = pSymbolPtr1;
			for (k = 0; rule_table[i].Selects[j][k].Name[0] != '\0'; k++)
			{
				const SYMBOL *pSymbol = &rule_table[i].Selects[j][k];

				*pSymbolPtr2 = CreateSymbol();
				(*pSymbolPtr2)->isToken = pSymbol->isToken;
				if (1 == pSymbol->isToken)
				{
					strcpy((*pSymbolPtr2)->TokenName, pSymbol->Name);
				}
				else
				{
					(*pSymbolPtr2)->pRule = FindRule(pHead, pSymbol->Name);
					if (NULL == (*pSymbolPtr2)->pRule)
					{
						printf("Init rules error, miss rule \"%s\"\n", pSymbol->Name);
						exit(1);
					}
				}

				pSymbolPtr2 = &(*pSymbolPtr2)->pNextSymbol;
			}

			pSymbolPtr1 = &(*pSymbolPtr1)->pOther;
		}

		pRule = pRule->pNextRule;
	}

	return pHead;
}

/*
功能：
	初始化文法链表(在执行流水线时调用)。
	
返回值：
	文法的头指针。
*/
Rule *InitRules_CI()
{
	int nRuleCount = 0;
	for (int i = 0; i < 20; i++)
	{
		gets(rule_table_ci[i]);
		int length = strlen(rule_table_ci[i]);
		if (length == 0)
		{
			break;
		}

		for (int j = 0; j < length; j++)
		{
			if (rule_table_ci[i][j] == ' ')
			{
				ruleNameArr[i][j] = '\0';
				break;
			}
			ruleNameArr[i][j] = rule_table_ci[i][j];
		}

		nRuleCount++;
	}

	Rule *pHead, *pRule;
	RuleSymbol **pSymbolPtr1, **pSymbolPtr2;

	int i, k;

	Rule **pRulePtr = &pHead;
	for (i = 0; i < nRuleCount; i++)
	{
		*pRulePtr = CreateRule(ruleNameArr[i]);
		pRulePtr = &(*pRulePtr)->pNextRule;
	}

	pRule = pHead;
	for (i = 0; i < nRuleCount; i++)
	{
		pSymbolPtr1 = &pRule->pFirstSymbol;

		int start = 0;
		for (int j = 0; rule_table_ci[i][j] != '\0'; j++)
		{
			if (rule_table_ci[i][j] == ' ' 
			&& rule_table_ci[i][j + 1] == '-' 
			&& rule_table_ci[i][j + 2] == '>' 
			&& rule_table_ci[i][j + 3] == ' ')
			{
				start = j + 4;
				break;
			}
		}

		for (k = start; rule_table_ci[i][k] != '\0'; k++)
		{
			if (rule_table_ci[i][k] == '|')
			{
				pSymbolPtr1 = &(*pSymbolPtr1)->pOther;
				pSymbolPtr2 = pSymbolPtr1;
				continue;
			}
			if (rule_table_ci[i][k] == ' ')
			{
				continue;
			}
			if (k == start)
			{
				pSymbolPtr2 = pSymbolPtr1;
			}

			*pSymbolPtr2 = CreateSymbol();

			char tokenName[MAX_STR_LENGTH] = {};
			tokenName[0] = rule_table_ci[i][k];
			tokenName[1] = '\0';
			(*pSymbolPtr2)->isToken = 1;
			for (int m = 0; m < nRuleCount; m++)
			{
				if (strcmp(tokenName, ruleNameArr[m]) == 0)
				{
					(*pSymbolPtr2)->isToken = 0;
					(*pSymbolPtr2)->pRule = FindRule(pHead, tokenName);
					if (NULL == (*pSymbolPtr2)->pRule)
					{
						printf("Init rules error, miss rule \"%s\"\n", tokenName);
						exit(1);
					}
				}
			}
			if ((*pSymbolPtr2)->isToken == 1)
			{
				strcpy((*pSymbolPtr2)->TokenName, tokenName);
			}

			pSymbolPtr2 = &(*pSymbolPtr2)->pNextSymbol;
		}

		pRule = pRule->pNextRule;
	}

	return pHead;
}

/*
功能：
	创建一个新的 Rule。

参数：
	pRuleName -- 文法的名字。
	
返回值：
	Rule 指针
*/
Rule *CreateRule(const char *pRuleName)
{
	Rule *pRule = (Rule *)malloc(sizeof(Rule));

	strcpy(pRule->RuleName, pRuleName);
	pRule->pFirstSymbol = NULL;
	pRule->pNextRule = NULL;

	return pRule;
}

/*
功能：
	创建一个新的 Symbol。
	
返回值：
	RuleSymbol 指针	
*/
RuleSymbol *CreateSymbol()
{
	RuleSymbol *pSymbol = (RuleSymbol *)malloc(sizeof(RuleSymbol));

	pSymbol->pNextSymbol = NULL;
	pSymbol->pOther = NULL;
	pSymbol->isToken = -1;
	pSymbol->TokenName[0] = '\0';
	pSymbol->pRule = NULL;

	return pSymbol;
}

/*
功能：
	根据 RuleName 在文法链表中查找名字相同的文法。

参数：
	pHead -- 文法的头指针。
	RuleName -- 文法的名字。
	
返回值：
	Rule 指针	
*/
Rule *FindRule(Rule *pHead, const char *RuleName)
{
	Rule *pRule;
	for (pRule = pHead; pRule != NULL; pRule = pRule->pNextRule)
	{
		if (0 == strcmp(pRule->RuleName, RuleName))
		{
			break;
		}
	}

	return pRule;
}

/*
功能：
	输出文法。

参数：
	pHead -- 文法的头指针。
*/
void PrintRule(Rule *pHead)
{
	Rule *p = pHead;
	while (p != NULL)
	{
		printf("%s->", p->RuleName);
		RuleSymbol *pp = p->pFirstSymbol;
		while (pp != NULL)
		{
			RuleSymbol *temp = pp;
			while (temp != NULL)
			{
				printf("%s", temp->isToken ? temp->TokenName : temp->pRule->RuleName);
				temp = temp->pNextSymbol;
			}
			pp = pp->pOther;
			if (pp)
			{
				printf("%s", "|");
			}
		}
		printf("\n");
		p = p->pNextRule;
	}
	//
	// TODO: 在此添加代码
	//
}
