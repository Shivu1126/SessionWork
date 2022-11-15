package rajeesantask;

import java.util.Scanner;

public class EncryptString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encrypt start = new Encrypt();
		start.init();
	}
}
class Encrypt
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter string 1");
		String str1 = scanner.next();
		System.out.println("Enter string 2");
		String str2 = scanner.next();
		for(int i=0;i<str1.length();i++)
		{
			int ascii = str1.charAt(i) + str2.charAt(i) - 'a' + 1;
			if(ascii>(int)'z')
				ascii = ascii-26;
			System.out.print((char)ascii);
		}
	}
}
//Input : 
//    string 1 : bvjk
//    string 2 : afdr
//Output : 
//    cbnc