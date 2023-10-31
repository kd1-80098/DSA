package Q1;
public class DoublyCircularLinkedList {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;
	private int count;

	public DoublyCircularLinkedList() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		// 1. create node
		Node nn = new Node(value);
		// 2. if list is empty
		if (isEmpty()) {
			// a. add newnode into head
			head = nn;
			// b. make list circular
			head.next = nn;
			head.prev = nn;
			count++;
		}
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			nn.next = head;
			// b. add last node into prev of newnode
			nn.prev = head.prev;
			// c. add newnode into next of last node
			head.prev.next = nn;
			// d. add newnode into prev of first node
			head.prev = nn;
			// e. move head on newnode
			head = nn;
			count++;
		}
	}

	public void addLast(int value) {

		Node nn = new Node(value);

		if (isEmpty()) {

			head = nn;

			head.next = nn;
			head.prev = nn;
			count++;
		}

		else {

			nn.next = head;

			nn.prev = head.prev;

			head.prev.next = nn;

			head.prev = nn;
			count++;
		}
	}

	public void deleteFirst() {

		if (isEmpty())
			return;

		else if (head.next == head) {
			head = null;
			count--;
		}

		else {

			head.prev.next = head.next;

			head.next.prev = head.prev;

			head = head.next;

			count--;
		}
	}

	public void deleteLast() {

		if (isEmpty())
			return;

		else if (head.next == head) {
			head = null;
			count--;
		}

		else {

			head.prev.prev.next = head;

			head.prev = head.prev.prev;

			count--;
		}
	}

	public void fDisplay() {
		if (isEmpty())
			return;

		Node trav = head;
		System.out.print("Forward List : ");
		do {

			System.out.print(" " + trav.data);

			trav = trav.next;
		} while (trav != head);
		System.out.println("");
	}

	public void rDisplay() {
		if (isEmpty())
			return;

		Node trav = head.prev;
		System.out.print("Reverse List : ");
		do {

			System.out.print(" " + trav.data);

			trav = trav.prev;
		} while (trav != head.prev);
		System.out.println("");
	}

	public void addAtPosition(int value, int position) {
		
		if (position < 1 || position > count + 1)
			{
			System.out.println("wrong position");
			return;
			}
		Node nn = new Node(value);
			if (isEmpty()) {
				head = nn;
				nn.next = head;
				nn.prev = head;
				count++;
			} 
			else if(position==1)
			{
				addFirst(value);
				
			}
			else {
				Node trav = head;
				for (int i = 1; i < position - 1; i++) {
					trav = trav.next;
				}
				nn.next = trav.next;
				nn.prev = trav;
				trav.next = nn;
				trav.next.next.prev = nn;
				count++;
			}
	}

	public void deleteAtPosition(int position) {
		if (isEmpty()) {
			System.out.println("List is empty!");
		} else if (head.next == null) {
			head = null;
			count--;
		} else {
			Node trav = head;
			for (int i = 1; i < position; i++) {
				trav = trav.next;
			}
			trav.next.prev = trav.prev;
			trav.prev.next = trav.next;
			count--;
		}
	}
}
