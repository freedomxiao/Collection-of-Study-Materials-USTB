#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int take_money(int* money,int m) {
	vector<int> dp(m);
	dp[0] = money[0];
	dp[1] = max(money[0], money[1]);
	for (int i = 2; i < m; i++) {//第三个开始
		dp[i] = max(dp[i - 1], dp[i - 2] + money[i]);//状态转移方程
	}
	return dp[m - 1];
}
int main() {
	int T, M;
	cin >> T;
	for (int i = 0; i < T; i++) {//T组数据
		cin >> M;
		int money[100100];
		for (int j = 0; j < M; j++) {//M个盒子
			cin >> money[j];
		}
		cout << take_money(money, M) << endl;
	}	
	return 0;
}
