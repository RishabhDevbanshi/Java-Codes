#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define umap unordered_map
#define deb(x) cout<<#x<<" = "<<x<<endl;
#define debarr(arr) for(auto x: arr) cout<<x<<" "; cout<<endl
#define debarr2(arr) for(auto v : arr){ for(auto x : v) cout<<x<<" "; cout<<endl; }
#define fo(i, k, n) for(int i=k;i<n;i++)
#define loop(i, k, n) for(int i=k;k<n?i<n:i>n;k<n?i+=1:i-=1)
#define vec(type) vector<type>
#define vec2(type,arr,a,b) vector<vector<int>> arr(a,vector<int>(b))
#define mp(a,b) make_pair(a,b)
#define pb push_back
int mod = 1e9 + 7;
int infinite = INT_MAX - 10;

template <typename T>
T power(T x, T y)
{
	T temp;
	if (y == 0)
		return 1;
	temp = power(x, y / 2);
	if (y % 2 == 0)
		return temp * temp;
	else
	{
		if (y > 0)
			return x * temp * temp;
		else
			return (temp * temp) / x;
	}
}

int countDigit(long long n)
{
	return floor(log10(n) + 1);
}

ll gcd(ll a, ll b)
{
	if (b == 0)
		return a;
	return a > b ? gcd(b, b % a) : gcd(a, a % b);
}

void solve(int n, int m, vec(vec(int)) &arr)
{
	int sum = 0;
	loop(i, 0, n)
	{
		loop(j, 0, m)
		{
			int tl = (i + 1) * (j + 1);
			int br = (n - i) * (m - j);
			int contribution = tl * br;
			int val = arr[i][j] * contribution;
			sum += val;
		}
	}
	deb(sum);
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int t;
	cin >> t;
	while (t--)
	{
		int n, m;
		cin >> n >> m;
		vec(vec(int)) arr(n, vec(int)(m));
		loop(i, 0, n) loop(j, 0, m) cin >> arr[i][j];
		solve(n, m, arr);
	}
}
