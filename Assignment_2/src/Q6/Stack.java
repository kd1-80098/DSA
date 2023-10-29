package Q6;

public class Stack {

	private int  arr[];
	private int top;
	private final int size;
	public Stack(int size)
	{	
		this.size=size;
		arr=new int[size];
		top=this.size-1;
	}
	
	public void push(int data)
	{
		if(isFull())
		{System.out.println("Stack is full!");}
		else{arr[top]=data;
		top--;
		System.out.println("Data pushed: " + data);
	}}
	
	public void pop()
	{	
		if(isEmpty())
		{
			System.out.println("Stack is empty!");
		}else {
		top++;
		System.out.println("data popped");}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty!");
		}else {
		System.out.println("Peeked element is: "+arr[top+1]);
	}}
	
	public boolean isFull()
	{
		return top==-1;
	}
	
	public boolean isEmpty()
	{
		return top==size-1;
	}
	
	
}
