#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int f[10][10], h[10][10];

int main() {
	string s;
	int N;
	cin >> s >> N;
	int maxx = 2 * 10e8;

	for (int i = 0; i < s.length(); i++)
		for (int j = 0; j < s.length(); j++)
		{
			int ans = 0; int c = 1;
			for (int k = j; k >= i; k--) {
				ans += (s[k] - '0')*c;
				c *= 10;
			}
			h[i][j] = ans;
		}

	for (int i = 0; i < s.length(); i++)
		for (int k = 1; k <= N; k++) {
			if (k == 1)f[i][k] = h[0][i];
			else f[i][k] = maxx;
		}

	for (int k = 2; k <= N; k++)
		for (int i = 0; i < s.length(); i++)
			for (int j = k - 2; j <= i - 1; j++) {
				f[i][k] = min(f[j][k - 1] + h[j + 1][i], f[i][k]);
			}
	cout << f[s.length() - 1][N] << endl;
	return 0;
}