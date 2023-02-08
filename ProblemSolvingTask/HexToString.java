package afterjan;

import java.util.Scanner;

public class HexToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert convert = new Convert();
		convert.init();
	}

}
class Convert
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter hexa values..");
		String hex = scanner.next();
		String str = "";
		for(int i=0;i<hex.length();i+=2)
		{
			String s = ""+hex.charAt(i)+""+hex.charAt(i+1)+"";
			char c = (char) Integer.parseInt(s,16);
			str += c; 
		}
		System.out.println(str);
	}
}
// Input: 5368697675
//Output: Shivu
