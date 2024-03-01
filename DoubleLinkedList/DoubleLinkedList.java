package com.jsp.Doublelinkedlist;

public class DoubleLinkedList {
	private Node head=null;
	private Node tail=null;
	private int cnt=0;
	
	public void add(Object e)
	{
		if(head==null)
		{
			head=new Node(e,null,null);
			tail=head;
			cnt++;
			return;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next,curr);
		tail=curr.next;
		cnt++;
	}
	
	public int size() {return cnt;}
	
	public Object get(int index)
	{
		if(index<0 || index>size())
			throw new ArrayIndexOutOfBoundsException();
		
		Node curr=head;
		
		for(int i=1;i<index;i++)
			curr=curr.next;
		
		Object e=curr.ele;
		return e;
		
	}
	
	public void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.ele+" ");
			curr=curr.next;
		}
		System.out.println();
			
	}
	
	public void add(Object e,int index)
	{
		if(index<0 || index>size())
			throw new ArrayIndexOutOfBoundsException();
		
		if(index==0)
		{
			Node newNode=new Node(e,head,null);
			head.pre=newNode;
			head=newNode;
			cnt++;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		Node newNode=new Node(e);
		newNode.next=curr.next;
		newNode.pre=curr;
		curr.next=newNode;
		cnt++;
		
	}
	public Object remove(int index)
	{
		if(index<0 || index>size())
			throw new ArrayIndexOutOfBoundsException();
		
		Node curr=head;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		Object temp=curr.next.ele;
		curr.next.next.pre=curr;
		curr.next=curr.next.next;
		cnt--;
		return temp;
	}
	public void reverse()
	{
		Node curr=tail;
		while(curr!=null)
		{
			System.out.print(curr.ele+" ");
			curr=curr.pre;
		}
	}

}
