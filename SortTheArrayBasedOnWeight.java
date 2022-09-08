package Arrays;
import java.util.*;

public class SortTheArrayBasedOnWeight {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size..");
		int size=s.nextInt();
		int arr[]=new int[size];
		int temp[]=new int[size];
		System.out.println("Enter the values...");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			int k=arr[i];
			int total=0;
			//check perfect square
			int square=0;
			int num=1;
			while(square != k)
			{
				
				if(k<square)
					break;
				square=num*num;
				num++;
			}
			if(square==k)
				total+=5;
			
			//multiple of 4 and divisible by 6
			
			if(k%4==0 && k%6==0)
				total+=4;
			
			//Even or not
			if(k%2==0)
				total+=3;
			
			temp[i]=total;			
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(temp[i]<temp[j])
				{
					int t1=temp[i];
					int t2=arr[i];
					
					temp[i]=temp[j];
					arr[i]=arr[j];
					
					temp[j]=t1;
					arr[j]=t2;
				}
			}
		}

		for(int i=0;i<size;i++)
		{
			System.out.print("<"+arr[i]+","+temp[i]+">" + " ");
		}
		s.close();
	}
}
