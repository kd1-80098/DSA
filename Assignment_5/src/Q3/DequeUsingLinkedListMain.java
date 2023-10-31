package Q3;

import java.util.Scanner;

public class DequeUsingLinkedListMain{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dequeue queue=new Dequeue();
		int choice=1;
		while(choice!=0)
		{
			System.out.println("Enter choice from below!\n1. push front\n2. pop front\n3. push rear\n4. pop rear\n5. peek");
			choice=sc.nextInt();
			switch(choice)
			{
			
			case 1:{
				System.out.println("Enter data to push from front");
				int data=sc.nextInt();
				queue.pushFirst(data);
			}
			break;
			case 2:{
				queue.popFirst();
			}
			break;
			case 3:{
				System.out.println("Enter data to push from rear");
				int data=sc.nextInt();
				queue.pushLast(data);
			}
			break;
			case 4:{
				queue.popLast();
			}
			break;
			case 5:{
				queue.peek();
			}
		}
	}
		
		sc.close();

}

}


