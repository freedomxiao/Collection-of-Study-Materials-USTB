#include<iostream>
#include<string>
using namespace std;

string str;
void judge(int len, int k) {
	int flag = 0;
	string temp = str.substr(k, len);
	for (int i = 0; i < len-1; i++) {
		if (temp[i] != temp[len - i-1]) {
			flag = 1;
			break;
		}	
	}
	if (flag == 0)
		cout << str.substr(k, len) << endl;
}
int main() {
	cin >> str;
	for (int i = 2; i <= str.length(); i++) {//遍历每个长度
		for (int k = 0; k <= str.length()-i; k++) {//以i的长度滑行
			judge(i, k);
		}
	}
	return 0;
}