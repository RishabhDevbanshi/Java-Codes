public void removeAt(int idx) {
		if(idx<0 || idx>=size)
		{
			System.out.println("Invalid arguments");
			return;
		}
		else if(idx==0)
		{
			removeFirst();
			return;
		}
		else if(idx==size-1)
		{
			removeLast();
			return;
		}
		Node temp = head;
		for(int i=0;i<idx-1;i++)
		{
		    temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	}
