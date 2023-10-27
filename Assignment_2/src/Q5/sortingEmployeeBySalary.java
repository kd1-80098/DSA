package Q5;

import java.util.Arrays;

public class sortingEmployeeBySalary {

	public void furtherImprovedBubbleSort(Employee[] emp, int N) {
		int count = 0;
		int passes = 0;
		int flag;

		for (int i = 1; i < N; i++) {
			passes++;
			flag = 0;

			for (int j = 0; j < N - i; j++) {
				count++;

				if (emp[j].getEmpSalary() > emp[j + 1].getEmpSalary()) {
					Employee temp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;
		}
		System.out.println("No of comparisions : " + count);
		System.out.println("No of passes : " + passes);
	}

	public static void main(String[] args) {

		Employee[] emp = new Employee[6];

		emp[0] = new Employee(1, "e1", 100000);
		emp[1] = new Employee(2, "e2", 200000);
		emp[2] = new Employee(3, "e3", 80000);
		emp[3] = new Employee(4, "e4", 60000);
		emp[4] = new Employee(5, "e5", 40000);
		emp[5] = new Employee(6, "e6", 65000);

		System.out.println("Before sorting the array of employees by salary ");
		for (Employee e : emp)
			System.out.println(e);
		sortingEmployeeBySalary sebs = new sortingEmployeeBySalary();
		sebs.furtherImprovedBubbleSort(emp, emp.length);
		System.out.println("After sorting the array by employee: ");
		 for (Employee e : emp)
		System.out.println(e);
		 
//		 System.out.println(Arrays.toString(emp));
		 

	}

}
