public int kthFromLast(int k){
      k = size-k;
      Node temp = head;
      for(int i=0;i<k-1;i++)
      {
          temp = temp.next;
      }
      return temp.data;
    }
