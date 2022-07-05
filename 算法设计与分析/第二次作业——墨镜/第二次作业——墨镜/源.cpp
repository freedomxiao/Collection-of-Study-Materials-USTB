#include<iostream>
#include<string>
using namespace std;
bool judge(string str, int l) {
	for (int i = 0; i <= l/2; i++) {
		if (str[i] != str[l - i-1])
			return false;
	}
	return true;
}
int main() {
	string str;
	cin >> str;
	int length = str.length();
	while (true)
	{
		if (length % 2 == 0 && judge(str, length)) {
			length /= 2;
		}
		else break;
	}
	cout << length;
	return 0;
}