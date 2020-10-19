/*package whatever //do not write package name here */

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
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = scn.nextInt();
	        }
	        int key = scn.nextInt();
	        int ans = findpos(arr,0,n-1,key);
	        System.out.println(ans);
	        t--;
	    }
	}
	public static int findpos(int[] arr,int l,int r,int key)
	{
	    if(l>r)
	      return -1;
	    
	    int mid= l + (r-l)/2;
	    
	    if(arr[mid]==key)
	       return mid;
	   
	   if(arr[l]<=arr[mid])
	   {
	       if(key>=arr[l] && key<=arr[mid])
	         return findpos(arr,l,mid-1,key);
	       else
	         return findpos(arr,mid+1,r,key);
	   }
	   
	   if(key<=arr[r] && key>=arr[mid])
	     return findpos(arr,mid+1,r,key);
	   
	   return findpos(arr,l,mid-1,key);   
	}
}
