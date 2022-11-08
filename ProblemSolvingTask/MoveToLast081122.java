package problemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class MoveToLast081122 {

	public static void main(String[] args) {
		MoveToLast start = new MoveToLast();
		start.init();
	}
}
class MoveToLast
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() {
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Enter values..");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scanner.nextInt();
		}
		int k=0;
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]!=7)
			{
				arr[k]=arr[i];
				k++;
			}
			else
				count++;
		}
		size--;
		while(count>0)
		{
			arr[size--]=7;
			count--;
		}
		System.out.println(Arrays.toString(arr));
	}
}