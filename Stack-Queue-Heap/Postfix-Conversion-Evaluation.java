import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        int ans = evaluatePostFix(exp);
        System.out.println(ans);
        
        String infix = Infix(exp);
        System.out.println(infix);
        
        String prefix = Prefix(exp);
        System.out.println(prefix);
    }
    
    public static String Prefix(String exp)
    {
        Stack<String> st = new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                String v2 = st.pop();
                String v1 = st.pop();
                String calc = ConP(v1,v2,ch);
                st.push(calc);
            }
            else
            {
                st.push(Character.toString(ch));
            }
        }
        return st.peek();
    }
    
    public static String ConP(String v1,String v2,char op)
    {
        return (Character.toString(op)+v1+v2);
    }
    
    public static String Infix(String exp)
    {
        Stack<String> st = new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                String v2 = st.pop();
                String v1 = st.pop();
                String calc = ConI(v2,v1,ch);
                st.push(calc);
            }
            else
            {
                st.push(Character.toString(ch));
            }
        }
        return st.peek();
    }
    
    public static String ConI(String v2,String v1,char op)
    {
        return ("(" + v1 + Character.toString(op) + v2 + ")");
    }
    
    public static int evaluatePostFix(String exp) {
        Stack < Integer > st = new Stack < > ();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 + v2);
            } else if (ch == '-') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 - v2);
            } else if (ch == '*') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 * v2);
            } else if (ch == '/') {
                int v2 = st.pop();
                int v1 = st.pop();
                st.push(v1 / v2);
            } else {
                st.push(ch - '0');
            }
        }
        return st.peek();
    }
}
