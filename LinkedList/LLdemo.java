package com.jsp.linkedlist;

public class LLdemo {
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(100);
		l.add(20);
		l.add(82);
		l.add(70);
		l.add(90,2);
		l.add(10,0);
		for(int i=1;i<=l.size();i++)
		{
		  System.out.print(l.get(i)+" ");
		  
		}
	}

}
