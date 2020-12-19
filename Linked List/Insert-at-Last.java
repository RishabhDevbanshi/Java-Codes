public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
        size++;
      Node nn = new Node();
      nn.data = val;
      nn.next = null;
      if(head==null)
      {
          head = nn;
          tail = nn;
          return ;
      }
      Node temp = head;
      while(temp.next!=null)
      {
          temp = temp.next;
      }
      temp.next = nn;
      tail = temp.next;
    }
  }
