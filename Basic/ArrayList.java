/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //declarartion
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list + " -> " + list.size());
		
		//add elements at last 
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list + " -> " + list.size());
		
		//add elemets at given index
		list.add(1,1000);     //this will add 1000 at index 1 
		System.out.println(list + " -> " + list.size());
		
		//get elemets at any index 
		int val = list.get(1); //Get element at index 1 in val 
		System.out.println(val); //list[1] will produlce error 
		
		//change value of elemet at any Index
		list.set(1,2000); //change element 1 to 2000 from 1000
		                  //list[1]=2000 will give error
		System.out.println(list + " -> " + list.size());
		
		//remove element at any index 
		list.remove(1); //removes element at index 1 
		System.out.println(list + " -> " + list.size());
	}
}
