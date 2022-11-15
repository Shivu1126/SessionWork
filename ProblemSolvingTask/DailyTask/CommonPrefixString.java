package rajeesantask;

import java.util.Scanner;

public class CommonPrefixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonStr start = new CommonStr();
		start.init();
	}
}
class CommonStr
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		String strArr[] = new String[size];
		System.out.println("Enter strings");
		for(int i=0;i<size;i++)
		{
			strArr[i]=scanner.next();
		}
		System.out.println(findString(strArr));
	}
	private String findString(String[] strArr) {
		String prefixStr = strArr[0];
		for(int i=1;i<strArr.length;i++)
		{
			while(strArr[i].indexOf(prefixStr) != 0)
			{
				prefixStr = prefixStr.substring(0, prefixStr.length()-1);
			}
		}
		return prefixStr;
	}
}
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""