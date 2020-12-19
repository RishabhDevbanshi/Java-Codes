public void removeLast(){
      if(size==0)
      {
          System.out.println("List is empty");
          return;
      }
      if(size==1)
      {
          size--;
          head = tail = null;
      }
      size--;
      Node temp = head;
      while(temp.next!=tail)
      {
          temp = temp.next;
      }
      temp.next = null;
      tail = temp;
    }
