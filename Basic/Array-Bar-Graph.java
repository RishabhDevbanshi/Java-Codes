import java.util.Scanner;

import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
              max=arr[i];
        }
        while(max>0)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>=max)
                  System.out.print("*\t");
                else
                  System.out.print("\t");
            }
            System.out.println();
            max--;
        }
    }
}
