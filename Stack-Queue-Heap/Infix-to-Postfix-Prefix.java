class solve{
	public static String infixToPostfix(String exp) {
		Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> operator = new Stack<>();
        
        for(int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(ch==' ') continue;
            
            else if(ch=='(')
            {
                operator.push(ch);
            }
            else if(ch==')')
            {
                while(operator.peek()!='(')
                {
                    String v2 = post.pop();
                    String v1 = post.pop();
                    char op = operator.pop();
                    String res = postCalculater(v1,v2,op);
                    post.push(res);
                    v2 = pre.pop();
                    v1 = pre.pop();
                    res = preCalculater(v1,v2,op);
                    pre.push(res);
                }
                operator.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^')
            {
                while(!operator.empty() && operator.peek()!='(' &&
                      precedence(ch)<=precedence(operator.peek()) )
                  {
                      String v2 = post.pop();
                    String v1 = post.pop();
                    char op = operator.pop();
                    String res = postCalculater(v1,v2,op);
                    post.push(res);
                    v2 = pre.pop();
                    v1 = pre.pop();
                    res = preCalculater(v1,v2,op);
                    pre.push(res);
                  }
                  operator.push(ch);
            }
            else
            {
                String chr = Character.toString(ch);
                post.push(chr);
                pre.push(chr);
            }
        }
        
        while(!operator.empty())
        {
            String v2 = post.pop();
            String v1 = post.pop();
            char op = operator.pop();
            String res = postCalculater(v1,v2,op);
            post.push(res);
            v2 = pre.pop();
            v1 = pre.pop();
            res = preCalculater(v1,v2,op);
            pre.push(res);
        }
        return post.peek();
	} 
	public static int precedence(char ch)
    {
        if(ch=='+') return 1;
        else if(ch=='-') return 1;
        else if(ch=='*') return 2;
        else if(ch=='/') return 2;
        else return 3;
    }
    
    public static String postCalculater(String v1,String v2,char op)
    {
        String chr = Character.toString(op);
        String ans = v1+v2+chr;
        return ans;
    }
    public static String preCalculater(String v1,String v2,char op)
    {
        String chr = Character.toString(op);
        String ans = chr+v1+v2;
        return ans;
    }
}
