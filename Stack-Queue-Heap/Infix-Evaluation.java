import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> values = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(ch=='(')
            {
                operator.push(ch);
            }
            else if(ch==')')
            {
                while(operator.peek()!='(')
                {
                    int v2 = values.pop();
                    int v1 = values.pop();
                    char chr = operator.pop();
                    int res = calculate(v1,v2,chr);
                    values.push(res);
                }
                operator.pop();
            }
            else if(Character.isDigit(ch))
            {
                values.push(ch-'0');
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                while(!operator.empty() && operator.peek()!='(' && 
                       precedence(ch) <= precedence(operator.peek()))
                {
                    int v2 = values.pop();
                    int v1 = values.pop();
                    char chr = operator.pop();
                    int res = calculate(v1,v2,chr);
                    values.push(res);
                }
                operator.push(ch);
            }
        }
        
        while(!operator.empty())
        {
            int v2 = values.pop();
            int v1 = values.pop();
            char chr = operator.pop();
            int res = calculate(v1,v2,chr);
            values.push(res);
        }
        
        System.out.println(values.peek());

    }
    public static int calculate(int v1,int v2,char ch)
    {
        if(ch=='+') return v1+v2;
        else if(ch=='-') return v1-v2;
        else if(ch=='*') return v1*v2;
        else return v1/v2;
    }
    public static int precedence(char ch)
    {
        if(ch=='+') return 1;
        else if(ch=='-') return 1;
        else if(ch=='*') return 2;
        else return 2;
    }
}
