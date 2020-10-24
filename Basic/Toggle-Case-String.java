import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		StringBuilder answer = new StringBuilder(str.length());
		for(char letter : str.toCharArray())     //to convert string to char array
		{
		    if(Character.isUpperCase(letter))    //to check for upper case
		        letter = Character.toLowerCase(letter);  //to convert to lower case
		    else
		        letter = Character.toUpperCase(letter);
		
		    answer.append(letter);
		}
		return answer.toString();    //to convert StringBuilder to String
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
