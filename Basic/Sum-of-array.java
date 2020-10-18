import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0;i<n1;i++)
    {
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++)
    {
        arr2[i] = scn.nextInt();
    }
    int[] sum = new int[n1>n2?n1:n2];
    int carry = 0;
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = sum.length - 1;
    while(k>=0)
    {
        int digit = carry;
        if(i>=0)
          digit += arr1[i];
        if(j>=0)
           digit += arr2[j];
        
        carry = digit/10;
        digit%=10;
        sum[k] = digit;
        i--;
        j--;
        k--;
    }
    if(carry > 0)
      System.out.println(carry);
    for(int c : sum)
       System.out.println(c);
 }

}
