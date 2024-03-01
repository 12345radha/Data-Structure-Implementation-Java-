package com.jsp.linkedlist;

public class LinkedList {
	private Node head=null;
	private int cnt=0;
	
	public void add(Object e)
	{
		if(head==null)
		{
			head=new Node(e,head);
			cnt++;
			return;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e);
		cnt++;
	}
	
	public int size() {return cnt;}
	
	public void add(Object e,int index)
	{
		if(index<0 || index>size())throw new ArrayIndexOutOfBoundsException();
		if(index==0)
		{
			head=new Node(e,head);
			cnt++;
			return;
		}
		
		Node curr=head;
		for(int i=1;i<index;i++)
			curr=curr.next;
		curr.next=new Node(e,curr.next);
		cnt++;
		
	}
	
	public Object get(int index)
	{
		if(index<0 || index>size())throw new ArrayIndexOutOfBoundsException();
		Node curr=head;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		Object temp=curr.ele;
		return temp;
	}
	
	public Object remove(int index)
	{
		if(index<0 || index>size())throw new ArrayIndexOutOfBoundsException();
		if(index==0)
		{
			Object ele=head.ele;
			head=head.next;
			cnt--;
			return ele;
		}
		Node curr=head;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		Object temp=curr.next.ele;
		cnt--;
		curr.next=curr.next.next;
		return temp;
	}
	public void reverse()
	{
		Node curr=null,pre=null,Next=null;
		curr=head;
		while(curr!=null)
		{
			Next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=Next;	
		}
		head=pre;
		
	}

}
