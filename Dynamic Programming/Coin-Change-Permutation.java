import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<coins.length;i++)
           coins[i] = scn.nextInt();
        int target = scn.nextInt();
        
        int[] dp = new int[target+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++)
        {
            for(int coin : coins)
            {
                if(coin <= i)
                {
                    dp[i] += dp[i-coin];
                }
            }
        }
        System.out.println(dp[target]);
    }
}
