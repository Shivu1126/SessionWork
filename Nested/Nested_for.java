package Nested;
import java.util.*;
public class Nested_for {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter row size...");
		int row=s.nextInt();
		System.out.println("Enter column size...");
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter values...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)		//This is called Nested-for (one for into the another for)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
		//Nested-for used to store and print the 2D array
	}

}
