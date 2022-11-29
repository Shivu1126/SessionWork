package problemSolving.balasantask;

import java.util.Scanner;

public class ValidParanthesisCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parenthesis start = new Parenthesis();
		start.init();
	}
}
class Parenthesis
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter string");
		String str = scanner.next();
		int len = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				len++;
			else
				len--;
		}
		System.out.println(len);
	}
}