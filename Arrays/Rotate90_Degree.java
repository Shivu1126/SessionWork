package Arrays;
import java.util.*;
public class Rotate90_Degree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row and cloumn size...");
		int row=s.nextInt();
		int column=s.nextInt();
		
		int matrixArr[][]=new int[row][column];
		System.out.println("Enter the values...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrixArr[i][j]=s.nextInt();
			}
		}
		System.out.println("Before Rotate..");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrixArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("After rotate..");		
		for(int i=0;i<column;i++)
		{
			for(int j=row-1;j>=0;j--)
			{
				System.out.print(matrixArr[j][i]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
