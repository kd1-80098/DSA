package Q1;

import java.util.Scanner;

public class BinarySearchCount {
	static int count = 0;

	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			count++;

			mid = (left + right) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {

				right = mid - 1;
			} else {

				left = mid + 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = binarySearch(arr, arr.length, key);
		if (index != -1) {
			System.out.println("Key is found at index " + index);
			System.out.println("Number of comparison required are: " + count);
		} else {
			System.out.println("Key is not found");
		}
		sc.close();
	}

}