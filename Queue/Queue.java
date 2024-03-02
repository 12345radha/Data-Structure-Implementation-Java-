package com.jsp.Queue;

public class Queue {
	 Node front=null;
	 Node rear=null;
	int cnt=0;
	
	public int size() {return cnt;}
	
	public boolean isEmpty() 
	{
		return cnt==0;
	}
	
	public void add(Object ele)
	{
		Node newNode=new Node(ele);
		if(front==null)
		{
			front=newNode;
			rear=front;
			cnt++;
			return;
		}
		rear.next=newNode;
		rear=rear.next;
		cnt++;
	}
	
	public Object poll()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return null;
		}
		Object e=front.ele;
		front=front.next;
		cnt--;
		return e;
	}
	
	public Object peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return null;
		}
		return front.ele;
	}
	public void display()
	{
		Node curr=front;
		while(curr!=null)
		{
			System.out.print(peek()+" ");
			poll();
			curr=curr.next;
		}
		System.out.println();
	}

}
