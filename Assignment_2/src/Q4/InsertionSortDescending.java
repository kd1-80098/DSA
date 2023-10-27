package Q4;

import java.util.Arrays;

public class InsertionSortDescending {
	static int count = 0;

	public static void insertionSort(int arr[], int N) {

		for (int i = 1; i <N ; i++) {
			int j;
			int temp = arr[i];

			for ( j = i - 1; j >= 0 && arr[j] < temp; j--) {
				count++;

				arr[j+1] = arr[j];
				
			}

			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };

		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Number of comparisons: " + count);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
