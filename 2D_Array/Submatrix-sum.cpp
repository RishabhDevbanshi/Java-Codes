void sumOfAllSubMatrix(int n, int m, vec(vec(int)) &arr)
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
