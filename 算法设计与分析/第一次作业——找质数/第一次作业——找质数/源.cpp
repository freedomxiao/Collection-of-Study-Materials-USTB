#include<iostream>
using namespace std;

int main()
{
	int p[100000] = { 0 };
	for (int i = 2; i*i < 100000; i++) {
		if (p[i] == 0) {
			for (int j = i * i; j < 100000; j = j + i)
				p[j] = 1;
		}
	}
	int t, n;
	cin >> t;
	for (int i = 0; i < t; i++) {//t¸öÊý
		cin >> n;
		for (int j = 2; j <= n / 2; j++)
			if (p[j] == 0 && p[n - j] == 0) {
				cout << j << ' ' << n - j << endl;
				break;
			}
		printf("%d %d\n", i, n - i);
	}
	return 0;
}