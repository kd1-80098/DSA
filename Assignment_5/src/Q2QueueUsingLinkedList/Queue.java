package Q2QueueUsingLinkedList;

import java.util.ArrayList;

public class Queue {

	LinkedList list;
	
	public Queue()
	{
		list=new LinkedList();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public void enque(int value)
	{
		list.addFirst(value);
		System.out.println("Value pushed: "+value);
	}
	
	public void deque()
	{
		list.deleteLast();
		System.out.println("Data Popped!");
	}
	
	public void peek()
	{
		list.displayList();
	}
}
