public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
    }

    int size() {
      return data.size();
    }

    void push(int val) {
      if(data.size()==0)
      {
          data.push(val);
          min = val;
      }
      else if(val >= min)
      {
          data.push(val);
      }
      else
      {
          data.push(val + val - min);
          min = val;
      }
    }

    int pop() {
      if(data.size()==0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
      else
      {
          if(data.peek() >= min)
          {
              return data.pop();
          }
          else
          {
              int temp = min;
              min = 2*min  - data.peek();
              data.pop();
              return temp;
              
          }
      }
    }

    int top() {
      if(data.size()==0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
      else if(data.peek()>=min)
      {
          return data.peek();
      }
      else
      {
          return min;
      }
    }

    int min() {
      if(data.size()==0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
      return min;
    }
  }
