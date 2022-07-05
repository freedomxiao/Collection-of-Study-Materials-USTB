#include<iostream>
using namespace std;

int find(int *a, int n, int lim)
{
	int count = 1;
	int sum = 0;
	for (int i = 0; i < n; i++)
	{
		if (a[i] > lim)//太小了，直接返回
			return INT_MAX;
		else
		{
			sum += a[i];
			if (sum > lim)//重新开一个
			{
				sum = a[i];
				count++;
			}
		}
	}
	return count;
}
int get(int *a, int n, int m,int sum)
{
	if (a == NULL || n == 0 || m == 0)
		cout << "error" << endl;
	
	int min = 0;
	int max = sum;

	while (min != max - 1)//值的二分
	{
		int mid = (min + max) / 2;
		if (find(a, n, mid) > m)//大于所要求的M，得放大
			min = mid;
		else            //find(a,n,mid) <= m 得缩小
			max = mid;
	}
	return max;
}


int main()
{
	int a[10010];
	int N, M;
	cin >> N >> M;
	int sum = 0;
	for (int i = 0; i < N; i++) {
		cin >> a[i];
		sum += a[i];
	}
	
	cout << get(a, N, M,sum) << endl;
	return 0;
}
