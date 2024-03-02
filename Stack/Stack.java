package com.jsp.Stack;

public class Stack {
	private Node first=null;
	private int cnt=0;
	
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e,first);
			cnt++;
			return;
		}
		first=new Node(e,first);
		cnt++;
	}
	
	public int size() {
		return cnt;
	}
	public boolean isEmpty() {
		return cnt==0;
	}
	
	public Object pop() {
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return null;
		}
		Object e=first.ele;
		first=first.next;
		cnt--;
		return e;
	}
	
	public Object peek() {
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return null;
		}
		return first.ele;
	}
	public void display(){
		Node curr=first;
		while(!isEmpty())
		{
			System.out.print(peek()+" ");
			pop();
			curr=curr.next;
			
		}
		System.out.println();
	}

}
