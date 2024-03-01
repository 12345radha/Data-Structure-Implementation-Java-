package com.jsp.arraylist;
import java.util.*;
class ArrayList {

	private Object[] a=new Object[5];
	private int cnt=0;
	
	
	public void add(Object ele)
	{
		if(cnt>=a.length)
		{
			Object[] temp=new Object[a.length+3];
			System.arraycopy(a, 0, temp, 0, cnt);
			a=temp;
		}
		a[cnt++]=ele;
	}
	
	public int size() {return cnt;}
	
	public void add(Object ele,int index)
	{
		if(index>size() || index<0)
			throw new ArrayIndexOutOfBoundsException();
		if(cnt==a.length)add(ele);

			for(int i=size()-1;i<=index;i--)
				a[i+1]=a[i];
			a[index]=ele;
			cnt++;
	}
	
	public Object get(int index)
	{
		if(index>size() || index<0)
			throw new ArrayIndexOutOfBoundsException();
		return a[index];
	}
	
	public void set(int index, Object ele)
	{
		if(index>size() || index<0)
			throw new ArrayIndexOutOfBoundsException();
		
		a[index]=ele;
	}
	public Object remove(int index)
	{
		if(index>size() || index<0)
			throw new ArrayIndexOutOfBoundsException();
		
		Object ele=a[index];
		for(int i=index+1;i<size();i++)a[i-1]=a[i];
		cnt--;
		return ele;
	}

}
package com.jsp.arraylist;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList ar=new ArrayList();
      ar.add(10);
      ar.add(40);
      ar.add(80);
      ar.add(30);
      ar.add(50,2);
      System.out.println("Remove="+ar.remove(2));
      System.out.println(ar.size());
      for(int i=0;i<ar.size();i++)
      {
    	  if(ar.get(i)!=null)
    	  System.out.println(ar.get(i));
      }
	}

}

