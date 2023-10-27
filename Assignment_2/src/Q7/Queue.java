package Q7;

public class Queue {

	private int arr[];
	private int rear, front;
	private final int size;

	public Queue(int size) {
		this.size = size;
		this.rear = 0;
		this.front = 0;
		arr = new int[size];
	}

	public boolean isFull() {
		return rear == size - 1;
	}

	public boolean isEmpty() {
		return rear == -1;
	}
	
	public void push(int data)
	{
		rear++;
		arr[rear]=data;
	}
	public int peek()
	{
		return arr[front + 1];
	}
	
	public void pop()
	{
		front++;
	}

}
