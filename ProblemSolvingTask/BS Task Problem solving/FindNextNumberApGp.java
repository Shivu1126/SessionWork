package problemSolving.balasantask;

import java.util.Scanner;

public class FindNextNumberApGp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNextNumber start = new FindNextNumber();
		start.init();
	}
}
class FindNextNumber
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Enter values");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scanner.nextInt();
		}
		int diff=0;
		int temp=0;
		for(int i=1;i<size;i++)
		{
			if(i==1)
			{
				diff = arr[i]-arr[i-1];
				temp = diff;
			}
			if(i!=1)
			{
				diff = arr[i]-arr[i-1];
				if(diff!=temp)
				{
					System.out.println("Last value is : "+(2*arr[size-1]));
					return;
				}
			}
		}
		System.out.println("Last value is : "+(arr[size-1]+diff));
	}
}