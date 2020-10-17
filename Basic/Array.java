import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];   //declaring array of size n
    for(int i=0;i<n;i++)
    {
        arr[i] = scn.nextInt();
    }
    Arrays.sort(arr);   //sorting array
    int max = arr[arr.length - 1];
    int min = arr[0];
    System.out.println(max - min);
 }

}
