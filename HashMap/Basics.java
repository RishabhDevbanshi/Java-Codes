/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India",140);
		hm.put("China",200);
		hm.put("UK",20);
		hm.put("US",30);
		hm.put("Africa",69);
		
		System.out.println(hm);
		
		System.out.println(hm.get("India"));
		System.out.println(hm.get("Utopia"));
		hm.put("UK",25);
		hm.put("Nigeria",40);
		
		System.out.println(hm);
		
	    System.out.println(hm.containsKey("India"));
	    System.out.println(hm.containsKey("Wakanda"));
	    
	    Set<String> keys = hm.keySet();
	    System.out.println(keys);
	    
	    for(String key : hm.keySet())
	    {
	        Integer val = hm.get(key);
	        System.out.println(key+ " " + val);
	    }
	}
	
}
