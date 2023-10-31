package Q2StackUsingLinkedList;

public class LinkedList {

	public class Node{
		private int data;
		private Node next;
		public Node(int value)
		{
			this.data=value;
			next=null;
		}
	}
	
	private Node head;
	
	public LinkedList()
	{
		head=null;

	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	// implementation of addFirst() function.
	public void addFirst(int value)
	{
		Node newnode=new Node(value);
	
		if(isEmpty())
		{
			head=newnode;
//			count++;
		}
		else {
			newnode.next=head;
			head=newnode;
//			count++;
		}
	}
	
	//Implementation of deleteFirst() function.
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!");
		}
		else {
			head=head.next;
//			count--;
		}
	}
	
	public int getData()
	{
		return head.data;
	}
	
}
