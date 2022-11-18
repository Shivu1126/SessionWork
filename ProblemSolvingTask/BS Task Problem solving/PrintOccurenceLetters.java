package problemSolving.balasantask;

import java.util.Scanner;

public class PrintOccurenceLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LettersPrint start = new LettersPrint();
		start.init();
	}
}
class LettersPrint
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter string");
		String str = scanner.next();
		System.out.println(lettersPrint(str));
	}
	private String lettersPrint(String str) 
	{
		String ans = "";
		for(int i=0;i<str.length()-1;i++)
		{
			int num=1;
			char c = str.charAt(i);
			if(str.charAt(i+1)<='9' && str.charAt(i+1)>='0')
			{
				num = str.charAt(i+1) - '0';
				if(i<str.length()-2 && (str.charAt(i+2)<='9' && str.charAt(i+2)>='0'))
				{
					num = (num * 10) + (str.charAt(i+2) - '0') ;
					i++;
				}
				i++;
			}
			for(int j=0;j<num;j++)
			{
				ans += c;
			}
		}
		return ans;
	}
}

//Eg 1: Input : a1b10
//		Output: abbbbbbbbbb
//Eg 2: Input : b3c6d15
//   	Output: bbbccccccddddddddddddddd