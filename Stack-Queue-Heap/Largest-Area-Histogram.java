public static void largestAreaHistogram(int[] arr)
    {
        int n = arr.length;
        int[] rb = new int[n];
        rightBoundary(rb,arr);
        int[] lb = new int[n];
        leftBoundary(lb,arr);
        int maxarea = 0;
        for(int i=0;i<n;i++)
        {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i]*width;
            if(area > maxarea) maxarea = area;
        }
        System.out.println(maxarea);
    }
    public static void rightBoundary(int[] rb,int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        rb[n-1] = n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!st.empty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.empty()) rb[i]=n;
            else rb[i]=st.peek();
            st.push(i);
        }
    }
    public static void leftBoundary(int[] lb,int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        lb[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(!st.empty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.empty()) lb[i]=-1;
            else lb[i]=st.peek();
            st.push(i);
        }
    }
