/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static int power(int x, int n)
    {
        if(n==0)
          return 1;
        int xpnb2 = power(x,n/2);
        int xn = xpnb2 * xpnb2;
        if(n%2==1)
         xn = xn * x;
        return xn;
    }
    
    public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                if(j==0) dp[i][j] = 0;
                else if(i==0)
                {
                    if(j%coins[0]==0)
                        dp[i][j] = j/coins[0];
                    else
                        dp[i][j] = Integer.MAX_VALUE - 1;
                }
                else
                {
                    if(coins[i]<=j)
                        dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i]]);
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
        }
        if(dp[dp.length-1][dp[0].length-1] == Integer.MAX_VALUE-1)
            return -1;
        else
            return dp[dp.length-1][dp[0].length-1];
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int amount = scn.nextInt();
		
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
		    int x = scn.nextInt();
		    s.add(x);
		}
		int[] coins = new int[s.size()];
		int i=0;
		for(int x : s) {coins[i] = x;i++;}
		int ans = coinChange(coins,amount);
		System.out.println(ans);
	}
	
}
