package Q5;

import java.util.Scanner;

public class FirstNonRepeatingElement {

	public static int linearSearch(int arr[]) {
		int ele = -1;
		for (int i =0; i < arr.length; i++) {
			ele = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (ele == arr[j]) {
					ele = 0;
				}
			}
			if (ele != 0) {
				return ele;
			}

		}
		return ele;

	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,-1,2,1,0,4,-1,7,8};
		
		int element = FirstNonRepeatingElement.linearSearch(arr);
		
		if(element==0)
		{
			System.out.println("All elements are repeating!");
		}
		else {System.out.println("non repeating element is: "+element);}
		
	}

}
