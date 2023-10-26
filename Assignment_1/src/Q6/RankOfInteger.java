package Q6;

import java.util.Scanner;

public class RankOfInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter integer to find rank from  10, 20, 15, 3, 4, 4, 1 these numbers");
		int a=sc.nextInt();
		int rank=RankOfInteger.rankOfInteger(arr,arr.length,a);
		System.out.println("The rank of integer is: "+rank);
	}
	
	public static int rankOfInteger(int arr[],int size,int key)
	{	int cnt=-1;
		for(int i=0;i<size;i++)
		{	cnt++;
			
			if(arr[i]==key)
				break;	
		}
		return cnt;
	}
}
