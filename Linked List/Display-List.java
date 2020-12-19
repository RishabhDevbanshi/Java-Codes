public void display(){
      Node temp = head;
      while(temp != null)
      {
          System.out.print(temp.data+" ");
          temp = temp.next;
      }
      System.out.println();
    }
