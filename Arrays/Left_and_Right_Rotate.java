package Arrays;
import java.util.*;
public class Left_and_Right_Rotate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size..");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values..");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		int newArr[]=arr.clone();
		System.out.println("Enter the distance..");
		int d=s.nextInt();
		
		//Left Rotate...
		System.out.println("Left Rotate...");
		for(int i=0;i<d;i++)
		{
			int temp=arr[0];
			int j;
			for(j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}		
		System.out.println(Arrays.toString(arr));
		
		arr=newArr.clone();
		//Right Rotate...
		System.out.println("Right Rotate...");
		for(int i=0;i<d;i++)
		{
			int temp=arr[size-1];
			int j;
			for(j=size-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}	
		System.out.println(Arrays.toString(arr));
		
		s.close();
	}

}
