package problemSolving.balasantask;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotation start = new Rotation();
		start.init();
	}
}
class Rotation
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Enter k value");
		int k = scanner.nextInt();
		int temp = k;
		System.out.println("Enter values");
		int arr[][] = new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
			
		for(int i=0;i<size;i++)
		{
				while(temp!=0)
				{
					int num = arr[i][0];
					for(int l=0;l<size-1;l++)
					{	
						arr[i][l] = arr[i][l+1];
					}
					arr[i][size-1]=num;
					temp--;
				}
				temp=k;
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
//Enter size
//4
//Enter k value
//2
//Enter values
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
//output:
//3 4 1 2 
//7 8 5 6 
//11 12 9 10 
//15 16 13 14