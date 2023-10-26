package Q1;

import java.util.Scanner;

public class LinearSearchCount {
	static int count;

	public static int linear_search(int arr[], int size, int key) {

		for (int i = 0; i < size; i++) {
			count++;

			if (arr[i] == key)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 66, 11, 33, 88, 22, 99, 77, 33 };

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = linear_search(arr, arr.length, key);
		if (index != -1) {
			System.out.println("Key is found at index : " + index);
			System.out.println("Number of comparisons required are: " + count);
		} else {
			System.out.println("Key is not found");
		}

		sc.close();
	}

}
