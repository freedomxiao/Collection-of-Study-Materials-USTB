#include<iostream>
using namespace std;
int main() {
	long long  C[200][200] = { 0 };
	int n, m;
	cin >> n >> m;

	for (int i = 0; i <= n; i++) {
		C[i][0] = 1;
		C[i][i] = 1;
	}
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= m && j < n; j++)
			C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % 1000000007;
	}
	cout << C[n][m] % 1000000007;
	return 0;

}