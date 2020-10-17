//Problem Link : https://www.youtube.com/watch?v=O7PlWc9lOzg

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=1,ans=0;
        while(n>0)
        {
            int rem = n%10;
            ans+=count*(Math.pow(10,rem-1));
            count++;
            n/=10;
        }
        System.out.println(ans);
    }
}
