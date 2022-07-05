#include<iostream>
#include<math.h>
using namespace std;
long int pw(int x, int y, int p) {
	if (!y) {//y=0
		return 1;
	}
	long int res = pw(x, y / 2, p) * pw(x, y / 2, p) % p;
	
	if (y & 1) {//yÎªÆæÊý
		res = res * x % p;
	}
	return res;
}
int main() {
	int x, y, p;
	cin >> x >> y >> p;
	cout << pw(x, y, p) << endl;
	cout << "----------" << endl;
	int ans = pow(x, y);

	cout << ans % p;
	return 0;
}
