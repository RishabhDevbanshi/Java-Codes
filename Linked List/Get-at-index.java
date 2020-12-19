public int getFirst(){
      if(head==null)
      {
          System.out.println("List is empty");
          return -1;
      }
      Node temp = head;
      return temp.data;
    }

    public int getLast(){
      if(head==null)
      {
          System.out.println("List is empty");
          return -1;
      }
      return tail.data;
    }

    public int getAt(int idx){
      if(head==null)
      {
          System.out.println("List is empty");
          return -1;
      }
      if(idx>=size)
      {
          System.out.println("Invalid arguments");
          return -1;
      }
      int count=0;
      Node temp = head;
      while(temp.next!=null && count!=idx)
      {
          temp=temp.next;
          count++;
      }
      return temp.data;
    }
