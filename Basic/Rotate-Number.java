//Problem Link : https://www.youtube.com/watch?v=ysMHtDIlU0c

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      String str = Integer.toString(n); //string to integer
      if(k>0)
      {
          k%=str.length();
      }
      else
      {
          k+=str.length();
          k%=str.length();
      }
      while(k>0)
      {
          int last = n%10;
          n+= last * Math.pow(10,str.length());
          n/=10;
          k--;
      }
      System.out.println(n);
    }
   }
