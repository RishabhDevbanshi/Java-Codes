import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        int c = Math.max(arr1.length, arr2.length);
        if(c==arr1.length)
           {arr2=reverse(arr2);}
        else
           {arr1=reverse(arr1);}
        int[] arr = new int[c];
        for (int i = 0; i < c; i++) {
            if (arr1.length > i)
                arr[i] += arr1[i];
            if (arr2.length > i)
                arr[i] += arr2[i];
        }
        arr = reverse(arr);
        for (int x: arr) {
            System.out.println(x);
        }
    }
    public static int[] reverse(int a[])
    {
        int[] reversedArray = new int[a.length];
        int j = a.length;
        for(int i=0;i<a.length;i++)
        {
            reversedArray[j-1] = a[i];
            j--;
        }
        return reversedArray;
    }

}
