package Q2;

import java.util.Arrays;

public class BubbleSortComparison {

	public static void furtherImprovedBubbleSort(int arr[], int N) {
		int count = 0;
		int passes = 0;
		int flag;
		
		for(int i = 1 ; i < N ; i++) {
			passes++;
			flag = 0;
			
			for(int j = 0 ; j < N - i ; j++) {
				count++;
			
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		System.out.println("No of comparisions : " + count);
		System.out.println("No of passes : " + passes);
	}
	public static void main(String[] args) {
		int arr[] = {33, 22, 66, 55, 44, 11};
//		int arr[] = {11, 22, 33, 44, 55, 66};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		furtherImprovedBubbleSort(arr, arr.length);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}


