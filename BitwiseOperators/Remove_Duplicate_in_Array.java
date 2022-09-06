package BitwiseOperators;
import java.util.*;
public class Remove_Duplicate_in_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);		
		System.out.println("Enter the size...");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=j && (arr[i]^arr[j])==0)  	//XOR of same number is 0.
				{	
					for(int k=j+1;k<size;k++)		//Swap and reduce size by 1.
					{
						arr[k-1]=arr[k];
					}
					j--;
					size--;
				}
			}
		}
		
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		s.close();
	}

}
