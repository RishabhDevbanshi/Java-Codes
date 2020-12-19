public void removeFirst(){
      if(head==null)
      {
          System.out.println("List is empty");
          return ;
      }
      if(size==1)
      {
          head = tail = null;
          return;
      }
      head = head.next;
      size--;
    }
