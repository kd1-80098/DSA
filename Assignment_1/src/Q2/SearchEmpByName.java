package Q2;

import java.util.Scanner;

public class SearchEmpByName {

	public static int linear_search(Employee arr[], int size, String name) {

		for (int i = 0; i < size; i++) {
			if (arr[i].getEmpName().equals(name))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0]=new Employee(1,"Manas",10000);
		emp[1]=new Employee(2,"Anil",52185);
		emp[2]=new Employee(3,"John",10000);
		emp[3]=new Employee(4,"Prathamesh",10000);
		emp[4]=new Employee(5,"Kunal",10000);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name to be searched : ");
		String name=sc.next();

		int index = linear_search(emp, emp.length, name);
		System.out.println(index);
		if (index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");

		sc.close();
	}

}