package problemSolving;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSpiral start = new PrintSpiral();
		start.init();
	}

}
class PrintSpiral
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() {
		System.out.println("Enter n value");
		int n=scanner.nextInt();
		printSpiral(n);
	}
	private void printSpiral(int n) {
		int arr[][]=new int[n][n];
		int value = 1;
		int row=n, column=n;
		int i,r=0,c=0;
		while(r<row && c<column)
		{
			
			for(i=c;i<row;i++)			//Right Move
			{
				arr[c][i]=value++;			
			}
			r++;
			for(i=r;i<column;i++)		//Down Move
			{
				arr[i][column-1]=value++;
			}
			column--;
			
			if(r<row)
			{
				for(i=column-1;i>=c;i--)	//Left Move
				{
					arr[row-1][i]=value++;
				}
				row--;
			}
			if(c<column)
			{
				for(i=row-1;i>=r;i--)	//Up Move
				{
					arr[i][c]=value++;
				}
				c++;
			}
		}
		
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				System.out.print(arr[j][k]+" ");
			}
			System.out.println();
		}
		
	}
}