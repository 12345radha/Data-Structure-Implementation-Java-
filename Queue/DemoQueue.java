package com.jsp.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		System.out.println("Poll element "+q.poll());
		q.add(30);
		q.add(60);
		System.out.println("Poll element "+q.poll());
		q.add(80);
		q.add(70);
		System.out.println("Size of Queue "+q.size());
		q.display();

	}

}
