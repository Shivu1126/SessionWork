package problemSolving.balasantask;

import java.util.Scanner;

public class LargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintLargestString start = new PrintLargestString();
		start.init();
	}
}
class PrintLargestString
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter the String");
		String str = scanner.next();
		char arr[] = str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(new String(arr));
	}
}
//Enter the string1 : abdf
//Enter the string2 : hafd
//Sample Output:
//String1 : fdba
//String2 : hfda
