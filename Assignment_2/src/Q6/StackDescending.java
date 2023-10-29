package Q6;

import java.util.Scanner;

public class StackDescending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack(5);
		int choice = 1;
		while (choice != 0) {
			System.out.println("Enter from below options");
		System.out.println("0. Exit\n1. push\n2. pop\n3. peek");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the data!");
			int data = sc.nextInt();
			stack.push(data);
			
		}
			break;

		case 2: {
			
			stack.pop();
			
			break;
		}

		case 3: {
			stack.peek();
		}
		break;

		}

	}

}}
