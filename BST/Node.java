package com.jsp.binarySearchTree;

public class Node {
	int key;
	Node left;
	Node right;
	
	Node(int key)
	{
		this.key=key;
	}
	
	Node(int key,Node left,Node right)
	{
		this.key=key;
		this.left=left;
		this.right=right;
	}

}
