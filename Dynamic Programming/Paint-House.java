import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
               arr[i][j] = scn.nextInt();
        }
        long red=arr[0][0], blue=arr[0][1], green=arr[0][2];
        for(int i=1;i<arr.length;i++)
        {
            long nred=red, nblue=blue, ngreen=green;
            for(int j=0;j<arr[0].length;j++)
            {
                if(j==0)
                {
                    long mn = Math.min(blue,green);
                    nred = arr[i][j] + mn;
                }
                else if(j==1)
                {
                    long mn = Math.min(red,green);
                    nblue = arr[i][j] + mn;
                }
                else
                {
                    long mn = Math.min(blue,red);
                    ngreen = arr[i][j] + mn;
                }
            }
            red = nred; blue = nblue; green = ngreen;
        }
        long ans = red<blue?(red<green?red:green):(blue<green?blue:green);
        System.out.println(ans);
    }
}
