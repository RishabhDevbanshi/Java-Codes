import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
          arr[i] = scn.nextInt();
        int obsp = -arr[0]; int ossp = 0, ocsp = 0;
        for(int i=1;i<n;i++)
        {
            int nbsp = 0, nssp = 0,ncsp = 0;
            
            if(ocsp - arr[i] > obsp)
            {
                nbsp = ocsp - arr[i];
            }
            else
            {
                nbsp = obsp;
            }
            
            if(obsp + arr[i] > ossp)
            {
                nssp = obsp + arr[i];
            }
            else
            {
                nssp = ossp;
            }
            
            ncsp = Math.max(ocsp,ossp);
            
            ocsp = ncsp;
            ossp = nssp;
            obsp = nbsp;
        }
        System.out.println(ossp);
    }

}
