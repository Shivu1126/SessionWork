package rajeesantask;

import java.util.Scanner;

public class SnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake start = new Snake();
		start.init();
	}
}
class Snake
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() 
	{
		System.out.println("Enter n value");
		int n = scanner.nextInt();
		int val = 1;
		for(int i=0;i<n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
					System.out.print((val++)+" ");
				else
					System.out.print((val--)+" ");
			}
			if(i%2==0)
				val+=n-1;
			else
				val+=n+1;
			System.out.println();
		}
	}
}

//Input. :  4
//Output :
//    1 2 3 4
//   8 7 6 5
//  9 10 11 12
//16 15 14 13