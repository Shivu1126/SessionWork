package problemSolving.balasantask;

import java.util.Scanner;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveWord start = new RemoveWord();
		start.init();
	}
}
class RemoveWord
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() {
		System.out.println("Enter string");
		String str = scanner.nextLine();
		String strArr[] = str.split(" ");
		for(int i=0;i<strArr.length;i++)
		{
			for(int j=i+1;j<strArr.length;j++)
			{
				if(strArr[i].equals(strArr[j]))
					strArr[j] = "";
			}
		}
		for(int i=0;i<strArr.length;i++)
		{
				System.out.print(strArr[i]+" ");
		}
	}
}
//Sample Input 1:
//Enter the string : This is Zoho and Zoho is good
//Sample Output 1:
//The distinct words are : This is Zoho and good