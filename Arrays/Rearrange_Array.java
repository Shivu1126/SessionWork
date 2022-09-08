package Arrays;
import java.util.*;
public class Rearrange_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the array size..");
		int size=s.nextInt();
		int arr[]=new int[size];
		int result[]=new int[size];
		
		System.out.println("Enter the values..");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		
		Arrays.sort(arr);
		
		int start=size/2;
		if(size%2==0)
			start=(size/2)-1;
		result[0]=arr[start];
		
		int k=1;
		for(int i=start+1;i<size;i++)
		{
			result[k]=arr[i];
			k+=2;
		}
		k=2;
		for(int i=start-1;i>=0;i--)
		{
			result[k]=arr[i];
			k+=2;
		}
		
		System.out.println(Arrays.toString(result));
		s.close();
	}

}
