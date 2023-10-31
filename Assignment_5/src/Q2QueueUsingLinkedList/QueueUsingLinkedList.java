package Q2QueueUsingLinkedList;

import java.util.Scanner;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue queue=new Queue();
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
				queue.enque(data);
			}
			break;
			case 2:{
				queue.deque();
			}
			break;
			case 3:{
				queue.peek(); 
			}
			break;
		}
	}
		
		sc.close();

}

}

