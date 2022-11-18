package problemSolving.balasantask;

import java.util.Scanner;

public class DiamondStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondPattern start = new DiamondPattern();
		start.init();
	}

}
class DiamondPattern
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter string");
		String str = scanner.next();
		if(str.length()%2==0)
			System.out.println("Not possible");
		else
			printPattern(str);
	}
	private void printPattern(String str) 
	{
		int leftMove = str.length()/2;
		int rightMove = leftMove; 
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(leftMove==j || rightMove==j)
					System.out.print(str.charAt(j));
				else
					System.out.print(" ");
			}
			if(i<str.length()/2)
			{	leftMove--;
				rightMove++;
			}
			else
			{
				leftMove++;
				rightMove--;
			}
			System.out.println();
		}
	}
}
//Sample Input:
//Enter the String : Eight
//Sample Output:
//        g
//      i   h
//    e       t
//      i   h
//        g