public void addFirst(int val) {
      size++;
      Node temp = new Node();
      temp.data = val;
      temp.next = null;
      if(head==null)
      {
          head = tail = temp;
          return;
      }
      temp.next = head;
      head=temp;
    }
