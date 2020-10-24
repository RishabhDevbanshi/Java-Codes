import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		//taking i/p
		String str = scn.nextLine(); //reads the whole line 
		//String s = scn.next();     //stop taking i/p when first space is encountered.
		
		System.out.println(str);
		
		//to get length of string 
		System.out.println(str.length()); 
		
		 //to get char at any index 
		char ch = str.charAt(2);         
		System.out.println(ch);
		
		//strings are immutable that is,
		// str.charAt(2) = 'e'; will result in error 
		
		//substring in a string 
		System.out.println(str.substring(1,3)); //will return substring from 1 to 2, 3 is exclusive
		System.out.println(str.substring(2)); //will return substr from 2 to the end 
		
		//one case of string concatenation
		String a = "hello";
		a += 10; //in this case 10 converts first itself to a string and then gets added to string 
		System.out.println(a);
		
		//one more concept 
		//println evaluates from left to right
		System.out.println("hello" + 10 + 20);   //o/p -> hello1020
		System.out.println(10 + 20 + "hello");    //o/p -> 30hello
		
		
		//splitting string into an array : string.split()
		String b= "abc def ghi jkl mno";
		String[] parts = b.split(" ");   //splits the string at spaces
		for(int i=0;i<parts.length;i++)
		 System.out.print(parts[i] + " ");
	}
}
