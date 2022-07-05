//#include<iostream>
//#include<algorithm>
//using namespace std;
//struct song {
//	int before;
//	int after;
//	int c;//能压缩掉的大小
//};
//int cmp(song a, song b)
//{
//	return a.c < b.c;
//}
//int main() {
//	int n, m;
//	cin >> n >> m;
//	song s[10100];
//	int cur = 0;
//	for (int i = 0; i < n; i++) {
//		cin >> s[i].before;
//		cin >> s[i].after;
//		s[i].c = s[i].before - s[i].after;
//		cur += s[i].after;
//	}
//	if (cur > m) {
//		cout << -1;
//		return 0;
//	}
//	sort(s, s + n, cmp);
//	int i = 0; int ans = n;
//	while (cur + s[i].c <= m&&i<n)
//	{
//		ans--;
//		cur += s[i].c;
//		i++;
//	}
//	cout << ans;
//	return 0;
//}