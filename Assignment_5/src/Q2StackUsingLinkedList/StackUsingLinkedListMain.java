package Q2StackUsingLinkedList;

import java.util.Scanner;

public class StackUsingLinkedListMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack stack=new Stack();
		int choice=1;
		while(choice!=0)
		{
			System.out.println("Enter choice from below!\n1. push data\n2. pop data\n3. peek data\n");
			choice=sc.nextInt();
			switch(choice)
			{
			
			case 1:{
				System.out.println("Enter data to push!");
				int data=sc.nextInt();
				stack.push(data);
			}
			break;
			case 2:{
				stack.pop();
			}
			break;
			case 3:{
				stack.peek();
			}
			break;
		}
	}
		
		sc.close();

}

}
