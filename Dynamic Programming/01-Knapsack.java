import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] v = new int[n];
        for(int i=0;i<v.length;i++)
          v[i] = scn.nextInt();
        int[] w = new int[n];
        for(int i=0;i<w.length;i++)
           w[i] = scn.nextInt();
        int cap = scn.nextInt();
        int[][] dp = new int[n][cap+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(j==0) dp[i][j]=0;
                else if(i==0) 
                {
                    if(j>=w[0]) dp[i][j] = v[0];
                }
                else
                {
                    if(j >= w[i]) 
                      dp[i][j] = Math.max(dp[i-1][j],v[i]+dp[i-1][j - w[i]]);
                    else
                       dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
    }
}
