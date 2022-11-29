package problemSolving.balasantask;

import java.util.Scanner;

public class SortArray0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderArray start = new OrderArray();
		start.init();
	}
}
class OrderArray
{
	private Scanner scanner = new Scanner(System.in);
	protected void init()
	{
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		System.out.println("Enter values");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scanner.nextInt();
		}
		int start = 0,mid = 0,end = size-1;
		int temp;
		while(mid<=end)
		{
			if(arr[mid]==0)
			{
				temp = arr[start];
				arr[start]=arr[mid];
				arr[mid]=temp;
				start++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else
			{
				temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end--;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
//input : 0 2 1 2 0
//output: 0 0 1 2 2 