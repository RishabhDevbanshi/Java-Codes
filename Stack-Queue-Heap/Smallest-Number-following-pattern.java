public static void smallestNumberPattern(String str)
	{ 
		Stack<Integer> st = new Stack<>();
		int num = 1;
		for(int i=0;i<=str.length();i++)
		{
			st.push(num++);
			if(i==str.length() || str.charAt(i)=='i')
			{
				while(!st.empty())
				{
					System.out.print(st.peek());
					st.pop();
				}
			}
		}
	}
