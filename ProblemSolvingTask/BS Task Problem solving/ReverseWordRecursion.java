package problemSolving.balasantask;

import java.util.Scanner;

public class ReverseWordRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion start = new Recursion();
		start.init();
	}
}
class Recursion
{
	private Scanner scanner = new Scanner(System.in);
	protected void init()
	{
		System.out.println("Enter String");
		String str = scanner.nextLine();
		reverseWord(str);
	}
	private void reverseWord(String str) 
	{
		if(str==null || str.length()<=1)
			System.out.println(str);
		else
		{
			int index = 0 ;
			for(int i=str.length()-1;i>=0;i--)
			{
				if(str.charAt(i)==' ')
				{
					index = i;
					break;
				}
			}
			String word = "";
			int space = 1;
			if(index==0)
				space=0;
			for(int j=index+space;j<str.length();j++)
				word += str.charAt(j); 
			System.out.print(word+" ");
			reverseWord(str.substring(0, index));
		}
	}
}
//Eg 1: Input: one two three
//Output: three two one
//Eg 2: Input: I love india
//Output: india love I