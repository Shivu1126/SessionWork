package rajeesantask;

import java.util.Scanner;

public class NextBiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindBigNumber start = new FindBigNumber();
		start.init();
	}
}
class FindBigNumber
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		System.out.println("Enter array values");
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			int max=arr[i];
			int temp=0;
			for(int j=0;j<size;j++)
			{
				if(arr[i]<arr[j] && temp!=1)
				{
					max=arr[j];
					temp=1;
				}
				else if(arr[i]<arr[j] && temp==1)
				{
					if(max>arr[j])
						max=arr[j];
				}
			}
			System.out.print(max+" ");
		}
	}	
}
//Input : {8, 4, 1, 9, 6, 2}
//Output : {9, 6, 2, 9, 8, 4}
//Explanation : {8 -> 9, 4 -> 6, 1 -> 2, 9 -> 9, 6 -> 8, 2 -> 4}
