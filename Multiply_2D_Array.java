package Arrays;
import java.util.*;
public class Multiply_2D_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first array row and column size..");
		int row1=s.nextInt();
		int column1=s.nextInt();
		System.out.println("Enter second array row and column size..");
		int row2=s.nextInt();
		int column2=s.nextInt();
		
		int array1[][]=new int[row1][column1];
		int array2[][]=new int[row2][column2];
		int answer[][]=new int[row1][column2];
		
		System.out.println("Enter 1st array values..");
		for(int i=0;i<row1;i++)
			for(int j=0;j<column1;j++)
				array1[i][j]=s.nextInt();
		
		System.out.println("Enter 2nd array values..");
		for(int i=0;i<row2;i++)
			for(int j=0;j<column2;j++)
				array2[i][j]=s.nextInt();		
		
		s.close();
		
		if(row2!=column1)
		{
			System.out.println("Column of 1st array and Row of 2nd array is Not equal..");
			System.out.println("So...Multiply is not possible..");
			return;
		}
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column2;j++)
			{
				answer[i][j]=0;
				
				for(int k=0;k<column1;k++)
				{
					answer[i][j]+=array1[i][k]*array2[k][j];
				}								
			}
		}		
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column2;j++)
				System.out.print(answer[i][j]+" ");
			System.out.println();
		}
		
	}

}
