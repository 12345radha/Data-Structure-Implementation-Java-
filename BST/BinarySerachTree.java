package com.jsp.binarySearchTree;
import java.util.*;
public class BinarySerachTree {
	Node root=null;
	int cnt=0;
	boolean flag=true;
	
	public boolean isEmpty()
	{
		return cnt==0;
	}
	
	public int size() {
		return cnt;
	}
	
	//Adding element in bst
	
	public boolean add(int key)
	{
		root=add(root,key);
		return flag;
	}
	
	
	
	public Node add(Node node,int key)
	{
		if(node==null)
		{
			node=new Node(key);
			cnt++;
			return node;
		}
		
		if(key<node.key)
		{
			node.left=add(node.left,key);
		}
		
		else if(key>node.key)
		{
			node.right=add(node.right,key);
		}
		else
			flag=false;
		
		return node;
		
	}
	
	public void preorder(Node root)
	{
		if(root==null)return;
		System.out.println(root.key+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public void postorder(Node root)
	{
		if(root==null)return;
		
		preorder(root.left);
		preorder(root.right);
		System.out.println(root.key+" ");
	}
	public void inorder(Node root)
	{
		if(root==null)return;
		
		preorder(root.left);
		System.out.println(root.key+" ");
		preorder(root.right);
	}
	public void levelOrder(Node root)
	{
		Queue q=new ArrayDeque();
		q.add(root);
		while(!q.isEmpty())
		{
			Node n=(Node)(q.poll());
			System.out.print(n.key);
			if(n.left!=null)
				q.add(n.left);
			if(n.right!=null)
				q.add(n.right);
		}
	}
	  
	
//	remove element of array
	public void remove(int key)
	{
		remove(root,key);
	}
	
	public Node remove(Node n,int key)
	{
		if(n==null)return null;
		
		if(key<n.key)
			n.left=remove(n.left,key);
		else if(key>n.key)
			n.right=remove(n.right,key);
		else {
			if(n.left==null)return n.right;
			else if(n.right==null)return n.left;
			
			n.key=minValue(n.right);
			n.right=remove(n.right,key);
		}
		return n;
		
		
	}
	
	public int minValue(Node n)
	{
		int min=n.key;
		while(n.left!=null)
		{
			min=n.left.key;
			n=n.left;
		}
		return min;
	}
	
	
	

}
