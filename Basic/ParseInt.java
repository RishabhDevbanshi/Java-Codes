// In cases when we have to take integer and string as input in one line we have to use    
//Integer.parseInt(scn.nextLine())

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scn = new Scanner(System.in);
	   int n = Integer.parseInt(scn.nextLine());
	   String name = scn.nextLine();
	   System.out.println("Hello " + name + " . This is your output :");
	   for(int i=0;i<n;i++)
	   {
	      System.out.print(i + " ");
	   }
	}
}
