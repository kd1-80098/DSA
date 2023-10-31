package Q2QueueUsingLinkedList;

import java.util.ArrayList;

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
	
	//Implementation of deleteLast() function.
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!");
			return;
		}
		else if(head.next==null)
		{
			head=null;
		}
		else {
			Node trav=head;
			while(trav.next.next!=null)
			{
				trav=trav.next;
			}
			trav.next=null;

		}
	}
	
public void displayList() {
	//1. create one referance and start at first node
	Node trav = head;
	System.out.print("List :");
	while(trav != null) {
		//2. print(visit) the current node
		System.out.print("  " + trav.data);
		//3. go on next node
		trav = trav.next;
	}//4. repeat step 2 and 3 till last node
	System.out.println("");
}
	
}
