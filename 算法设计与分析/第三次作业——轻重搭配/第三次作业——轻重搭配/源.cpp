#include<iostream>
#include<algorithm>
using namespace std;
int main() {
	int n;
	cin >> n;
	int stu[10000];
	for (int i = 0; i < n; i++) {
		cin >> stu[i];
	}
	sort(stu, stu + n);
	int k = n / 2;
	int ans = n;
	for (int i = 0; i < n / 2; i++) {
		while (k < n&&stu[i] * 2 > stu[k])k++;
		if (k >= n)break;
		ans--;
		k++;
	}
	cout << ans;
	return 0;
}