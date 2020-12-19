public void addAt(int idx, int val){
      Node temp = new Node();
      temp.data = val;
      temp.next = null;
      if(head==null && idx!=0)
      {
          System.out.println("Invalid arguments");
          return;
      }
      if(head==null && idx==0)
      {
          head = tail = temp;
          size++;
          return;
      }
      if(idx==0)
      {
          temp.next = head;
          head = temp;
          size++;
          return;
      }
      if(idx>size || idx<0)
      {
          System.out.println("Invalid arguments");
          return ;
      }
      if(idx==size)
      {
          size++;
          tail.next=temp;
          tail=temp;
          return;
      }
      size++;
      int count=0;
      Node prev = head;
      while(count!=idx-1)
      {
          prev = prev.next;
          count++;
      }
      temp.next = prev.next;
      prev.next = temp;
    }
