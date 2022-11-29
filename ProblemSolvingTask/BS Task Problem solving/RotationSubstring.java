package problemSolving.balasantask;

import java.util.Scanner;

public class RotationSubstring {

	public static void main(String[] args) {
		RotationString start = new RotationString();
		System.out.println(start.init());
	}
}
class RotationString
{
	private Scanner scanner = new Scanner(System.in);
	protected boolean init()
	{
		System.out.println("Enter string");
		String str = scanner.next();
		System.out.println("Enter sub string");
		String substr = scanner.next();
		char arr[] = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		while(str.length()>start)
		{
			char temp = arr[0];
			for(int i=0;i<str.length()-1;i++)
			{	
				arr[i] = arr[i+1];
			}
			arr[end]=temp;
			if(substr.equals(new String(arr)))
			{
				return true;
			}
			start++;
		}
		return false;
	}
}
//Enter string
//abdc
//Enter sub string
//cdba
//false

//abcd
//Enter sub string
//cdab
//true

