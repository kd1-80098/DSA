package Q2StackUsingLinkedList;

public class Stack {

	LinkedList list;

	public Stack()
	{
		list=new LinkedList();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public void push(int value)
	{
		list.addFirst(value);
		System.out.println("Value pushed: "+value);
	}
	
	public void pop()
	{
		list.deleteFirst();
		System.out.println("Data Popped!");
	}
	
	public void peek()
	{
		System.out.println("Data is: "+list.getData());
	}
}
