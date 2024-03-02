package com.jsp.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(20);
		s.push(50);
		s.push(80);
		s.push(90);
		System.out.println("Pop element "+s.pop());
		s.push(40);
		s.push(30);
		System.out.println("Peek element "+s.peek());
		s.display();
		

	}

}
