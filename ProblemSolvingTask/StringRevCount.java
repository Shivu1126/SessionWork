package problemSolving;

import java.util.Scanner;

public class StringRevCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRev start = new StringRev();
		start.init();
	}
}
class StringRev
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() {
		System.out.println("Enter the String");
		String str = scanner.next();
		String strRev = "";
		
		for(int i=str.length()-1;i>=0;i--)
			strRev += str.charAt(i);
		
		int temp = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==strRev.charAt(temp))
			{
				temp++;
			}
		}
		System.out.println(str.length()-temp);
	}
}