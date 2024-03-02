package com.jsp.Queue;


public class Node {
	Object ele;
	Node next;
	
	Node(Object ele,Node next)
	{
		this.ele=ele;
		this.next=next;
	}
	
	Node(Object e){
		this.ele=e;
	}
}
