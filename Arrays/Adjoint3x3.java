package Arrays;
import java.util.*;
public class Adjoint3x3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int size=s.nextInt();
		int column=size,row=size;
		
		int matrix[][]=new int[row][column];
		int adjoint[][]=new int[row][column];
		
		
		System.out.println("Enter the matrix values..");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		}
		
		if(row==2)		// 2 x 2
		{
			int temp=matrix[0][0];
			matrix[0][0]=matrix[1][1];
			matrix[1][1]=temp;
			matrix[0][1]=-matrix[0][1];
			matrix[1][0]=-matrix[1][0];
		}
		else			// 3 x 3
		{
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					adjoint[i][j]=coFactor(matrix,i,j,size);
				}
			}					
		}
		
		
		//transpose
		System.out.println("Adjoint...");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(adjoint[j][i]+" ");
			}
			System.out.println();
		}
		
		
		//Matrix inverse
		int _A_=0;
	//	int sign=-1;
		int i=0;
		for(int j=0;j<column;j++)
		{
			_A_+=matrix[i][j]*coFactor(matrix,i,j,size);
		}
		System.out.println("|A| = "+_A_);
		
		System.out.println("Inverse...");
		for(int k=0;k<size;k++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print((float)(adjoint[j][k])/_A_+" ");
			}
			System.out.println();
		}
		
		s.close();
	}
	public static int coFactor(int matrix[][],int a,int b,int size)
	{
		int value = 0;
		int k=0;
		int arr_2x2[]=new int[4];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=a && j!=b)
				{
					arr_2x2[k++]=matrix[i][j];
				}
			}
		}
		
		value=(arr_2x2[0]*arr_2x2[3])-(arr_2x2[2]*arr_2x2[1]);
		
		if((a+b)%2==1)
			value=-value;
		
		return value;
	}
}

//Enter the size of matrix
//3
//Enter the matrix values..
//1 2 3
//4 5 6
//7 2 9
//Adjoint...
//33 -12 -3 
//6 -12 6 
//-27 12 -3 
//|A| = -36
//Inverse...
//-0.9166667 0.33333334 0.083333336 
//-0.16666667 0.33333334 -0.16666667 
//0.75 -0.33333334 0.083333336 
