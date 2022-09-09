package Arrays;
import java.util.*;
public class Spiral_Matrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row and column...");
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
		System.out.println("Normal way");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrixArr[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("Spiral way");
		int k=0,i,l=0;
		while(k<row && l<column)
		{
			for(i=l;i<column;i++)
				System.out.print(matrixArr[k][i]+" ");		//Right move
			k++;
			
			for(i=k;i<column;i++)
				System.out.print(matrixArr[i][column-1]+" ");	//Down move
			column--;
			
			if(k<row)
			{	
				for(i=column-1;i>=l;i--)
					System.out.print(matrixArr[row-1][i]+" ");		//Left move	
				row--;
			}
			if(l<column)
			{
				for(i=row-1;i>=k;i--)
					System.out.print(matrixArr[i][l]+" ");		//Up move
				l++;
			}
		}
		
		
	}

}
