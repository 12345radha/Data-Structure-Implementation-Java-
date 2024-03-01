package com.jsp.Doublelinkedlist;

public class Node {
	Object ele;
	Node next;
	Node pre;
	
	Node(Object ele)
	{
		this.ele=ele;
	}
	
	Node(Object ele,Node next,Node pre)
	{
		this.ele=ele;
		this.next=next;
		this.pre=pre;
	}
	

}
