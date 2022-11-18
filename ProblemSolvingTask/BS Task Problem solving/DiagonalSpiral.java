package problemSolving.balasantask;

import java.util.Scanner;

public class DiagonalSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagonal start = new Diagonal();
		start.init();
	}
}
class Diagonal
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter n value");
		int number = scanner.nextInt();
		int arr[][] = new int[number][number];
		printDiagonal(number,arr);
	}
	private void printDiagonal(int number,int arr[][])
	{
		int value=1;
		int check = (number*(number+1))/2;
		int row=0,rowEnd=number-1;
		int col=0,colEnd=number-1;
		while(value<=check)
		{
			int temp = row;
			for(int index=col;index<=colEnd;index++)
			{
					arr[temp++][index] = value++;	
			}
			col++;
			rowEnd--;
			for(int index=rowEnd;index>=row;index--)
			{
					arr[index][colEnd] = value++;
			}
			colEnd--;
			rowEnd--;
			for(int index=colEnd;index>=col;index--)
			{
					arr[row][index]=value++;
			}
			col++;
			row++;
			
		}
		for(int k=0;k<number;k++)
		{
			for(int l=0;l<number;l++)
			{
				if(arr[k][l]!=0)
					System.out.printf("%3d",arr[k][l]);
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
//Enter n value
//input: 5
//output:  	1 12 11 10  9
//     	   	   2 13 15  8
//        		  3 14  7
//          		 4  6
//						5