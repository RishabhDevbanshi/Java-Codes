/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //To make mutable strings we use StringBuilder class
		StringBuilder str = new StringBuilder("Hello");
		System.out.println(str);
		
		//to get Character at any index
		char ch = str.charAt(0);
		System.out.println(ch);
		
		//Change Character at any index
		str.setCharAt(0,'D');
		System.out.println(str);
		
		//To insert character at any index 
		str.insert(2,'y');       //insert y at index 2
		System.out.println(str);
		
		//To remove character from any index 
		str.deleteCharAt(2);     //deletes character at index 2
		System.out.println(str);
		
		//to add at last 
		str.append('g');
		System.out.println(str);
		
		//to get length of string builder 
		System.out.println(str.length());
	}
}
