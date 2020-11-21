	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] vals = new int[n];
	        int[] wts = new int[n];
	        for(int i=0;i<n;i++)
	           vals[i] = scn.nextInt();
	        for(int i=0;i<n;i++)
	           wts[i] = scn.nextInt();
	        int cap = scn.nextInt();
	        int[] dp = new int[cap+1];
	        dp[0]=0;
	        for(int i=0;i<dp.length;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                if(i >= wts[j]) 
	                  dp[i] = Math.max(dp[i],vals[j]+dp[i-wts[j]]);
	            }
	        }
	        System.out.println(dp[cap]);
	    }
	}
