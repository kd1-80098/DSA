package Q3;

import java.util.ArrayList;

public class Dequeue {

	LinkedList list;
	
	public Dequeue()
	{
		list=new LinkedList();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public void pushFirst(int value)
	{
		list.addFirst(value);
		System.out.println("Value pushed: "+value);
	}
	
	public void popLast()
	{
		list.deleteLast();
		System.out.println("Data Popped!");
	}
	
	public void pushLast(int value)
	{
		list.addLast(value);
		System.out.println("value pushed: "+value);
	}
	
	public void popFirst()
	{
		list.deleteFirst();
		System.out.println("Data Popped!");
	}
	
	public void peek()
	{
		list.displayList();
	}
}
