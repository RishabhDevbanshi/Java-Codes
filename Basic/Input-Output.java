import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   System.out.println("What's your name?");
           
	   //Syntax => type identifier = type();
	   Scanner scanner = new Scanner(System.in);
	   String name = scanner.nextLine(); // nextLine is used to take string input....
		                             // for int and double we use nextInt(), nextDouble(), nextBigInteger(), etc...
	   
	   System.out.println("Hello " + name);
	}
}
