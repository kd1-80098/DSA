package Q4;

import java.util.Scanner;

public class NthOccurenceLinearSearch {

	public static int linearSearch(int arr[], int size, int key, int n) {
		int cnt=0;
		int j=0;
		for(int i=0;i<size;i++)
		{	cnt++;
			if(arr[i]==key)
			{
				j++;
				if(j==n)
				{
					System.out.println("no of comparisons are: "+cnt);
					return i;
					
				}
			}
		}
		System.out.println("no of comparisions done:" + cnt);
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 6, 3, 2, 3, 5, 8 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to Search:");

		int key = sc.nextInt();
		System.out.println("Enter Occurance:");

		int n = sc.nextInt();

		int index = linearSearch(arr, arr.length, key, n);
		if (index != -1) {
			System.out.println("Key Found at Index :" + index);
		} else {
			System.out.println("Key not found.");
		}
	}

}