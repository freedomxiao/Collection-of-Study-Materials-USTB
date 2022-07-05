#include<iostream>
#include<queue>
#include<vector>
using namespace std;
int main() {
	queue<long int>q;
	long int a[100010];
	int flag[100010] = { 0 };//都不在队列中
	int n;//有n个景点可选
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		long int x;
		cin >> x;
		a[i] = x;
	}
	int count = 0;
	int ans = 0;
	for (int i = 0; i < n; i++) {
		if (flag[a[i]] == 0) {//未出现过
			flag[a[i]] = 1;
			q.push(a[i]);
			count++;
		}
		else {//已经在队列中
			if (count > ans)  ans = count;
			while (q.front()!=a[i])
			{
				flag[q.front()] = 0;//修改为未在队列中
				q.pop();
			}
			q.pop();
			q.push(a[i]);
			count = q.size();
		}
	}
	if (count > ans)  ans = count;
	cout << ans;
	return 1;
}