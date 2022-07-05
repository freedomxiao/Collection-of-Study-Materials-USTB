```diff
+ 自己真的菜的可怜呀
```
# 2021-04-05
## 2017F 最大公共子串(PK最大公共子序列)
- [ ] **动态规划？？**
## 2017G 正则问题
动态规划？搜索？这题好难啊
可多练练二分查找，斐波那契，八皇后
# 2021-03-31
## 2017A 迷宫
 就是对每一个元素进行dfs（递归退出条件，标记走过，递归）
 当时第一次做的时候错了，由于对于每一个元素进行遍历的时候忘了把vis数组设置未走过，导致出了问题
## 2017B 跳蚱蜢（&&卡片交换）
 bfs：状态的演变 **状态+level 防止重复状态**
 本题还有一个难点：环形数组
 ```C++
 #include<queue>
 #include<set>
 
 struct StateAndLevel {
	 string state;
	 int level;
	 int pos0;
	 StateAndLevel(string s,int l,int p):state(s),level(l),pos0(p){}
};
queue<StateAndLevel> q;
set<string>allState;
q.push(StateAndLevel(start, 0, 0));
	while (!q.empty())
	{
		StateAndLevel sal = q.front();//取出第一个
		string state = sal.state;//赋值
		int level = sal.level;
		if (state == target) {
			cout << level;
			return 0;
		}
		int pos0 = sal.pos0;
		allState.insert(state);//insert到set
		//tianjialju
  		q.pop();//弹出
  }
  ```
## 2017C 魔方状态
放弃了

## 2017D 方格分割
女少口阿！依旧是dfs，但是是线的dfs（格子的不能产生T字型）
依旧是跳出条件（这里我想错了，它正确为等于边界时跳出）
      if访问过了，返回
      标记访问过
      dfs（）
      标记清除
      
## 2017E 字母组串
感觉比前面的题简单一点点，递归填空
 
# Design-and-Analysis-of-algorithm
【大三上】算法设计与分析

2020.11.21
不得不说【第二次作业】的连续因子自己做起来挺费力的

2020.11.23
【第三次作业】的文具店有点难度，运用了动态规划，PS:今天坐的太后面了，啥都听不到

2020.11.25
【第三次作业】的最近元素，弄了好久，不熟练鸭，PS:课程负担好重，学不完！

2020.11.27
【第三次作业】主要没思路，PS:最后一次作业了吧
