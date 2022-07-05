#include<iostream>
using namespace std;

int main() {
	int dp[80];
	int n;
	cin >> n;
	dp[0] = 0;
	dp[1] = 3;
	dp[2] = 7;
	for (int i = 3; i <= n; i++) {
		dp[i] = 2 * dp[i - 1] + dp[i - 2];
	}
	cout << dp[n] << endl;
	return 0;
}