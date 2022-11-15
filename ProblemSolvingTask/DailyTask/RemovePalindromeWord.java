package rajeesantask;

import java.util.Scanner;

public class RemovePalindromeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovePalindrome start = new RemovePalindrome();
		start.init();
	}
}
class RemovePalindrome
{
	private Scanner scanner = new Scanner(System.in);
	protected void init()
	{
		System.out.println("Enter a sentence");
		String sentence = scanner.nextLine();
		String[] array = sentence.split(" ");
		String newSentence = "";
		for(int i=0;i<array.length;i++)
		{
			if(palindromeCheck(array[i]))
				newSentence += array[i]+" ";
		}
		System.out.println(newSentence);
	}
	private boolean palindromeCheck(String str) 
	{
		String checkStr = str.toLowerCase();
		int start = 0;
		int end  = checkStr.length()-1;
		while(start<end)
		{
			if(checkStr.charAt(start)!=checkStr.charAt(end))
				return true;
			start++;
			end--;
		}
		return false;
	}
}