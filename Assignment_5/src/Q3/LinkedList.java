package Q3;

import java.util.ArrayList;

public class LinkedList {

	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			this.data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;

	}

	public boolean isEmpty() {
		return head == null;
	}

	// implementation of addFirst() function.
	public void addFirst(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;

		}
	}

	// Implementation of deleteLast() function.
	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return;
		} else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public void displayList() {

		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = tail = newnode;
		} else {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
		} else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}
	}

}
