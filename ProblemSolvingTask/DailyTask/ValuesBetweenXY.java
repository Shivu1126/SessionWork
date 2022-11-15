package rajeesantask;

import java.util.Scanner;

public class ValuesBetweenXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Values start = new Values();
		start.init();
	}
}
class Values
{
	private Scanner scanner = new Scanner(System.in);
	protected void init()
	{
		System.out.println("Enter X value");
		int x = scanner.nextInt();
		System.out.println("Enter Y value");
		int y = scanner.nextInt();
		System.out.println("Enter size value");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(x<arr[i] && y>arr[i])
				System.out.print(arr[i]+" ");
		}
	}
}

//Input : N = 11, X = 50, Y = 100, Arr = 21, 63, 54, 67, 13, 88, 43, 57, 604, 1, 100
//Output : 63, 54, 67, 88, 57