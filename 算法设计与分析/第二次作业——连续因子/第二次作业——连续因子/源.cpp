#include<iostream>
#include<algorithm>
using namespace std;
int main() {
	int N;
	cin >> N;
	for (int len = 12; len > 0; len--) {//13!>2^31
		for (int i = 2; i < sqrt(N) + 1; i++) {//从i开始len的滑行
			long long int temp = 1;
			for (int j = i ; j < i + len-1; j++)
				temp *= j;
			if (temp > N)break;
			if (N%temp == 0&&temp!=1) {//输出结果
				cout << len-1 << endl; 
				int m;
				cout << i;
				for ( m= 1; m < len-1; m++)
					cout<< "*" << i + m ;
				return 0;
			}
		}

	}
	cout << "1" << endl << N;
	return 0;
}