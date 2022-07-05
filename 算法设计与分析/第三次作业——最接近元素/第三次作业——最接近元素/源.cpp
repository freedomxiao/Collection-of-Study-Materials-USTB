#include<iostream>
using namespace std;
long int s[1000000];
int n;
long int find(int x) {
	long l = 0;
	long r = n - 1;
	long mid = (l + r) / 2;
	while (l < r)
	{
		if (x > s[mid]) {
			l = mid+1;
			mid = (l + r) / 2;
		}
		else if (x < s[mid]) {
			r = mid;
			mid = (l + r) / 2;
		}
		else {
			return mid;
		}
	}
	return l;
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> s[i];//scanf("%d", &s[i]);
	}
	int m;
	cin >> m;
	for (int i = 0; i < m; i++) {
		int x;
		cin >> x;
		if (x < s[0]) {
			cout << s[0] << endl;
		}
		else if (x > s[n - 1]) {
			cout << s[n - 1] << endl;
		}
		else {
			int ans = find(x);
			if (s[ans] == x)cout << s[ans] << endl;
			else if (abs(s[ans] - x) < abs(s[ans - 1] - x))cout << s[ans] << endl;
			else cout << s[ans - 1] << endl;
		}

	}
	return 0;
}