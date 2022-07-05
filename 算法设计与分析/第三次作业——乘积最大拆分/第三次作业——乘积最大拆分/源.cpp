#include<iostream>
#include<vector>
using namespace std;
int main()
{
	int n;
	cin >> n;
	vector<int> v;
	int temp = n; int count = 0;
	for (int i = 2;; i++) {
		if (temp - i >= 0) {
			v.push_back(i);
			temp -= i;
			count++;
		}
		else {
			break;
		}
	}
	if (temp > 0) {
		v[count-1]++;
		temp--;
		int c = count - 2;
		while (temp>0)
		{
			if(c>=0)v[c--]++;
			else {
				c = count -1;
				v[c--]++;
			}
			temp--;
		}
		
	}
	for (int i = 0; i < count; i++) {
		cout << v[i] << " ";
	}
	return 0;
}