package Q1;

import java.util.Arrays;

public class SelectionSortComparison {
	static int count=0;
	public static void selectionSort(int arr[],int length)
	{
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{	
				count++;
				
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {99,55,45,87,65,12,54,66,88,1,11,64};
		
		System.out.println("Array before sort: "+Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("Array After sort: "+Arrays.toString(arr));
		System.out.println("Number of comparisons required are: "+count);

	}

}
