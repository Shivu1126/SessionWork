package rajeesantask;

import java.util.Scanner;

public class RotateArray90degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate start = new Rotate();
		start.init();
	}
}
class Rotate
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter array row and column size");
		int size = scanner.nextInt();
		System.out.println("Enter ");
		int arr[][] = new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=size-1;i>=0;i--)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
	}
}