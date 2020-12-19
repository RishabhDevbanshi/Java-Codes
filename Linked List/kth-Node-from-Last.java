//by using size of linked list

public int kthFromLast(int k){
      k = size-k;  //here size is size of linked list
      Node temp = head;
      for(int i=0;i<k-1;i++)
      {
          temp = temp.next;
      }
      return temp.data;
    }

//without using size of linked list


public int kthFromLast(int k){
      Node slow = head;
      Node fast = head;
      for(int i=0;i<k;i++)
      {
          fast = fast.next;
      }
      while(fast.next!=null)
      {
          slow = slow.next;
          fast = fast.next;
      }
      return slow.data;
    }
