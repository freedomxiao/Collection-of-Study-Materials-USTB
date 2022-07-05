#include<iostream>
#include<algorithm>
#include<cstdio>
#include<cstring>
using namespace std;
int main() {

	int a[100010] = { 0 };
	int dp[100010] = { 0 };
	int n;
	cin >> n;
	for (int i = 1; i <= n; i++)
	{
		cin >> a[i];
	}
	int ans = 0;
	for (int i = n; i > 0; --i) {
		dp[i] = dp[a[i] + i] + 1;
		ans = max(ans, dp[i]);
	}
	cout << ans;
	return 0;
}