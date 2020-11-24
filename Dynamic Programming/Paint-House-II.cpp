#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define deb(x) cout<<#x<<" = "<<x<<endl;
#define fo(i, k ,n) for(int i=k;i<n;i++)
#define vec(type) vector<type>
int mod = 1e9 + 7;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int n, k;
	cin >> n >> k;
	vec(vec(int)) arr(n, vec(int)(k));
	fo(i, 0, n)
	fo(j, 0, k) cin >> arr[i][j];

	vec(int) dp(k);
	fo(j, 0, k) dp[j] = arr[0][j];

	fo(i, 1, n)
	{
		vec(int) temp(dp);
		fo(j, 0, k)
		{
			int mn = INT_MAX;
			fo(m, 0, dp.size())
			{
				if (m != j)
					mn = min(mn, dp[m]);
			}
			temp[j] = arr[i][j] + mn;
		}
		dp = temp;
	}
	int ans = INT_MAX;
	for (auto x : dp)
	{
		ans = min(ans, x);
	}
	cout << ans << endl;
	return 0;
}
