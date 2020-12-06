import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    int[] nextGreater = new int[arr.length];
    nextGreater[n-1] = n;
    Stack<Integer> st = new Stack<>();
    st.push(n-1);
    for(int i=n-2;i>=0;i--)
    {
        while(!st.empty() && arr[st.peek()]<=arr[i])
        {
            st.pop();
        }
        if(st.empty()) nextGreater[i] = n;
        else nextGreater[i] = st.peek();
        st.push(i);
    }
    
    for(int i=0;i<=n-k;i++)
    {
        int j=i;
        while(nextGreater[j] < i+k)
        {
            j=nextGreater[j];
        }
        System.out.println(arr[j]);
    }
    
 }
}
