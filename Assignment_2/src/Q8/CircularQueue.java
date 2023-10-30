package Q8;

public class CircularQueue {

	private int arr[];
	private int rear, front;
	private final int size;
	int counter;

	public CircularQueue(int size) {
		this.size = size;
		rear = -1;
		front = -1;
		arr = new int[this.size];
		counter = 0;
	}

	public void push(int data) {
		rear = (rear + 1) % size;
		arr[rear] = data;
		counter++;
	}

	public void pop() {
		front = (front + 1) % size;
		if (front == rear) {
			front = rear = -1;
		}
		counter--;
	}

	public int peek() {
		//System.out.println("Queue is empty!");
		return arr[(front + 1) % size];
	}

	public boolean isFull() {
		return counter == size;
	}

	public boolean isEmpty() {
		return counter == 0;
	}
}
