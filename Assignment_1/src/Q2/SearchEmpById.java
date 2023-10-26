package Q2;

import java.util.Scanner;

public class SearchEmpById {
	Scanner sc = new Scanner(System.in);

	public static int linear_search(Employee arr[], int size, int key) {

		for (int i = 0; i < size; i++) {

			if (arr[i].getEmpId()== key)
				return i;

		}

		return -1;
	}

	public static void main(String[] args) {
		
		Employee []emp=new Employee[5];
		emp[0]=new Employee(1,"Manas",100000);
		emp[1]=new Employee(2,"Aniket",90000);
		emp[2]=new Employee(3,"Prathamesh",500000);
		emp[3]=new Employee(4,"Anil",125000);
		emp[4]=new Employee(5,"Atish",75000);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Employee id to be searched : ");
		int key=sc.nextInt();

		int index = linear_search(emp, emp.length,key);
		if (index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");

		sc.close();
	}

}