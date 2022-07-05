#include<iostream>
#include<algorithm>
using namespace std;
int main() {
	int N;
	cin >> N;
	int b[10010];
	for (int i = 0; i < N; i++) {
		cin >> b[i];
	}
	int dp[10010];
	int ans = 0;
	for (int i = 0; i < N; i++) {
		dp[i] = b[i];
		for (int j = 0; j < i; j++) {
			if (b[j] < b[i])
				dp[i] = max(dp[j] + b[i], dp[i]);
		}
		if (dp[i] > ans)ans = dp[i];
	}
	cout << ans;
	return 0;
}