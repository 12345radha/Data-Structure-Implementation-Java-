package com.jsp.Doublelinkedlist;

public class DLLdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList d=new DoubleLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.display();
		d.add(70,2);
		d.display();
		d.remove(3);
		d.display();
		d.reverse();

	}

}
