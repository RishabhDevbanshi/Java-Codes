import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    if(k<0)
    {
        while(true)
        {
            k+=a.length;
            if(k>=0)
              break;
        }
    }
    k%=a.length;
    int c=0;
    int[] reversedArray = new int[a.length];
    for(int x: a)
    {
        reversedArray[c] = x;
        c++;
    }
    for(int i=0;i<a.length;i++)
    {
        a[(i+k)%a.length] = reversedArray[i];
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
