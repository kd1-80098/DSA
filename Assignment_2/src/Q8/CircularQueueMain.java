package Q8;

import java.util.Scanner;

public class CircularQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularQueue cq = new CircularQueue(5);
		int choice = 1;
		while (choice != 0) {
			System.out.println("Enter choice from below!\n1. push\n2. pop\n3. peek\n0. Exit\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:{
				if(cq.isFull())
				{
					System.out.println("Queue is full!");
				}
				else {
				System.out.println("Enter data to push!");
				int data = sc.nextInt();
				cq.push(data);
				System.out.println("data pushed: " + data);
				}
			}
				break;

			case 2:{
				if(cq.isEmpty())
				{
					System.out.println("Queue is empty!");
				}
				else {
				cq.pop();
				System.out.println("Data popped");
				}
			}
				break;

			case 3:{
				if (cq.isEmpty()) {
					System.out.println("Queue is empty!");
					}
			    else {
					System.out.println("Peeked data is: " + cq.peek());
				}
			}
				break;
			}
		}
		sc.close();
	}

}
