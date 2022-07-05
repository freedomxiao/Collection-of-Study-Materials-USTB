#include<iostream>
#include<stack>
#include<string>
using namespace std;
int main() {
	stack<char>s;
	string str;
	cin >> str;
	int ans = 0;
	for (int i = 0; i < str.length(); i++) {
		if (str[i] == '(')
			s.push('(');
		else {
			if (!s.empty())
			{
				s.pop();
				ans++;
			}
		}
		
	}
	cout << ans;
	return 0;
}