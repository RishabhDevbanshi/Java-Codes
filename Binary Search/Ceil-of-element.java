import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0)
		{
		    int n = scn.nextInt();
		    int ele = scn.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		      arr[i] = scn.nextInt();
		    
		    if(arr[0]>ele)
		    {
		        System.out.println(0);
		        t--;
		        continue;
		    }
		    if(arr[n-1]<ele)
		    {
		        System.out.println(-1);
		        t--;
		        continue;
		    }
		    int l=0 , r=n-1;
		    int res=-1;
		    while(l<=r)
		    {
		        int mid = l + (r-l)/2;
		        if(arr[mid]==ele)
		        {
		            res=mid;
		            break;
		        }
		        else if(ele<arr[mid])
		        {
		            res = mid;
		            r=mid-1;
		        }
		        else
		        {
		            
		            l=mid+1;
		        }
		    }
		    System.out.println(res);
		    t--;
		}
	}
}
