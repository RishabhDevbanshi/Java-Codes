import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
               arr[i][j] = scn.nextInt();
        }
        int[][] dp = new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            dp[i][m-1] = arr[i][m-1];
        }
        
        for(int j=m-2;j>=0;j--)
        {
            for(int i=0;i<n;i++)
            {
                int maxm = dp[i][j+1];
                if(i-1 >= 0) maxm = Math.max(maxm,dp[i-1][j+1]);
                if(i+1 < n) maxm = Math.max(maxm,dp[i+1][j+1]);
                dp[i][j] = arr[i][j] + maxm;
            }
        }
        int ans = -1;
        for(int i=0;i<n;i++)
        {
            if(ans < dp[i][0]) ans=dp[i][0];
        }
        System.out.println(ans);
    }

}
