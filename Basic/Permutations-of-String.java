import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		int n = str.length();
		int fact = factorial(n);
		for(int i=0;i<fact;i++)
		{
		    StringBuilder sb = new StringBuilder(str);
		    int temp = i;
		    for(int div=n;div>0;div--)
		    {
		        int r = temp%div;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp/=div;
		    }
		    System.out.println();
		}
	}
	
	public static int factorial(int n)
	{
	    int fact = 1;
	    for(int i=2;i<=n;i++)
	      fact*=i;
	    return fact;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
