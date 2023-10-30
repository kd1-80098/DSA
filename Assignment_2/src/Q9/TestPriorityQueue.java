package Q9;

import java.util.Scanner;

public class TestPriorityQueue {

	public static int operatorsPriority(String opr) {
		int result = 0;

		switch (opr) {
		case "+": {
			return 3;
		}
		case "-": {
			return 3;
		}
		case "*": {
			return 2;
		}
		case "/": {
			return 2;
		}
		case "(": {
			return 1;
		}
		case ")": {
			return 4;
		}
		default: {
			return result;
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator;
		int priority;
		System.out.println("Enter Operator to find priority");
		operator = sc.next();
		priority = operatorsPriority(operator);
		System.out.println("Operators priority is: "+priority);
	}

}
