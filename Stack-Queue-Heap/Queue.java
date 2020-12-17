 public static class CustomQueue {
    int[] data;
    int front;
    int rear;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = -1;
      rear = -1;
    }

    int size() {
      return (rear-front>0)?(rear-front)+1:0;
    }

    void display() {
      for(int i=front;i<=rear && i>=0;i++)
      {
          System.out.print(data[i] + " ");
      }
      System.out.println();
    }

    void add(int val) {
      if(rear==data.length-1)
      {
          System.out.println("Queue overflow");
          return;
      }
      else if(rear==-1)
      {
          front++; rear++;
          data[front] = val;
      }
      else
      {
          rear++;
          data[rear]=val;
      }
    }

    int remove() {
      if(rear==-1)
      {
          System.out.println("Queue underflow");
          return -1;
      }
      if(rear==front && rear!=-1)
      {
          int val = data[front];
          front--; rear--;
          return val;
      }
      int val = data[front];
      for(int i=front;i<=rear-1;i++)
      {
          data[i] = data[i+1];
      }
      rear--;
      return val;
    }

    int peek() {
       if(rear==-1)
       {
           System.out.println("Queue underflow");
           return -1;
       }
       return data[front];
    }
  }
