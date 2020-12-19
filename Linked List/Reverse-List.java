public void reverseList(){
      Node curr = head;
      Node temp = head;
      Node prev=null , after=null;
      while(curr!=null)
      {
          after = curr.next;
          curr.next = prev;
          prev = curr;
          curr = after;
      }
      tail = temp;
      head = prev;
    }
  }
