#include<iostream>
using namespace std;
int x[100]; int max_eight[9];
int eight[9][9] = {
{   0,0,0,0,0,0,0,0,0},
{   0,1,2,3,4,5,6,7,8},
{	0,9,10,11,12,13,14,15,16},
{	0,17,18,19,20,21,22,23,24},
{	0,25,26,27,28,29,30,31,32},
{	0,33,34,35,36,37,38,39,40},
{	0,41,42,43,44,45,46,47,48},
{	0,49,50,51,52,53,54,55,56},
{	0,57,58,59,60,61,62,63,64}
};
void show(int n) {
	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= n; j++)
			if (j != x[i])cout << "-";
			else cout << "o";
		cout << endl;
	}
}
bool Place(int k) {
	for (int i = 1; i < k; i++) {
		if (x[k] == x[i] || abs(k - i) == abs(x[k] - x[i]))
			return false;
	}
	return true;
}
void Queen(int n) {
	int max = 0; int sum = 0;
	int num = 0;
	for (int i = 1; i <= n; i++)
		x[i] = 0;
	int k = 1;
	while (k>=1)//(k,x[k])
	{
		x[k] += 1;
		while (x[k] <= n && !Place(k))//找第k行所能放的位置
			x[k] = x[k] + 1;
		if (x[k] <= n && k == n) {//放完了
			num++;
			if (n == 8) {
				for (int i = 1; i <= n; i++)
					sum += eight[i][x[i]];
				if (sum > max) {
					max = sum;
					
					for (int i = 1; i <= n; i++)
						max_eight[i] = x[i];
				}
				sum = 0;
			}
			if (num != 1)continue;
			//输出
			cout << "One of the ways:"<<endl;
			show(n);
			/*for (int i = 1; i <= n; i++) {
				cout << x[i] << " ";
			}*/
		}
		else if (x[k] <= n && k < n)//还没全部放完
			k = k + 1;
		else {
			x[k] = 0;
			k = k - 1;
		}
	}
	if(n==8)cout << endl << "sum_max=" << max;
	cout << endl << "There are " << num << " ways in total."<<endl;
}
int main() {
	int n;
	cin >> n;
	Queen(n);
	return 0;
}