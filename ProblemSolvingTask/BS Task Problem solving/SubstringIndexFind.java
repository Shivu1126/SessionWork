package problemSolving.balasantask;

import java.util.Scanner;

public class SubstringIndexFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubString start = new SubString();
		start.init();
	}
}
class SubString
{
	private Scanner scanner = new Scanner(System.in);
	protected void init()
	{
		System.out.println("Enter string");
		String str = scanner.next();
		System.out.println("Enter substring");
		String substr = scanner.next();
		int index = -1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==substr.charAt(0))
			{
				int count = 0;
				index = i;
				for(int j=0;j<substr.length();j++)
				{
					if( i<str.length() && substr.charAt(j)==str.charAt(i))
					{
						count++;
						i++;
					}
				}
				if(count!=substr.length())
					index = -1;
			}
		}
		System.out.println(index);
	}
}
//Eg 1:Input:
//    String 1: test123string
//     String 2: 123
//    Output: 4
//Eg 2: Input:
//    String 1: testing12
//    String 2: 1234 
//    Output: -1