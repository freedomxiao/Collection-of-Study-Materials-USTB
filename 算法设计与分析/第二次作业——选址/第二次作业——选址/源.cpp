#include<iostream>
#include<algorithm>
using namespace std;
int main() {
	int n; cin >> n;
	int p[100000];
	for (int i = 0; i < n; i++) {
		cin >> p[i];
	}
	sort(p, p + n);
	if (n % 2 == 0)cout << p[n / 2 - 1];
	else cout << p[n / 2];
	return 0;
}