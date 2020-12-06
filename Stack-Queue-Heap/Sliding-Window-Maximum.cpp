vec(int) solve(vec(int) arr, int k)
{
	int n = arr.size();
	stack<int> st;
	vec(int) nge(n);
	nge[n - 1] = n;
	st.push(n - 1);
	loop(i, n - 2, -1)
	{
		while (!st.empty() and arr[st.top()] <= arr[i])
		{
			st.pop();
		}
		if (st.empty()) nge[i] = n;
		else nge[i] = st.top();
		st.push(i);
	}
	vec(int) ans(n - k + 1);
	loop(i, 0, n - k + 1)
	{
		int j = i;
		while (nge[j] < i + k)
		{
			j = nge[j];
		}
		ans[i] = arr[j];
	}
	return ans;
}
