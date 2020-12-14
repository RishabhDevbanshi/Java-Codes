 public static void findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++) st.push(i);
        int n = arr.length;
        while(st.size()>1)
        {
            int i=st.pop();
            int j = st.pop();
            if(arr[i][j]==1) st.push(j);
            else st.push(i);
        }
        int pot = st.peek();
        for(int i=0;i<n;i++)
        {
            if(i!=pot && (arr[i][pot]==0 || arr[pot][i]==1))
            {
                System.out.println("none");
                return ;
            }
        }
        System.out.println(pot);
    }
