public int mid(){
      int count=0;
      Node fast = head;
      Node slow = head;
      while(fast.next!=null)
      {
          count++;
          fast = fast.next;
          if(count%2==0) slow=slow.next;
      }
      return slow.data;
    }
