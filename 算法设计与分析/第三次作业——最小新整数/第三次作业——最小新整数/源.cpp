#include<iostream>
#include<vector>
using namespace std;
vector<int> tostring(int n) {
	vector<int> temp;
	while (n!=0)
	{
		temp.push_back(n % 10);
		n /= 10;
	}
	//reverse(temp.begin(), temp.end());
	return temp;
}
int main() {
	long long t;
	cin >> t;
	for (int i = 0; i < t; i++) {//t个数
		int n, k;
		cin >> n >> k;
		vector<int> nn = tostring(n);
		int j = 0;
		while (j < k) {
			int p = nn.size() - 1;
			while (p>0&&nn[p-1] >= nn[p])p--;
			nn.erase(nn.begin() + p); //删除第3个元素
			j++;
		}
		
		
		for (int q = nn.size()-1; q >=0 ; q--) {
			if (q == nn.size() - 1 && nn[q] == 0)continue;
			cout << nn[q];
		}cout << endl;
	}
	return 0;
}