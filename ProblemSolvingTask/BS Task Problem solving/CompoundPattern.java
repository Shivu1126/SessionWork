package problemSolving.balasantask;

import java.util.Scanner;

public class CompoundPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern start = new Pattern();
		start.init();
	}
}
class Pattern
{
	private Scanner scanner = new Scanner(System.in);
	public void init() {
		System.out.println("Enter n value");
		int n = scanner.nextInt();
		int temp=n;
		int size = (2*n) -1;
		int arr[][] = new int[size][size];
		int start = 0, end = size-1;
 		while(temp!=0)
 		{
			for(int i=start;i<=end;i++)
			{
				for(int j=start;j<=end;j++)
				{
					if(i==start ||i==end || j==start || j==end)
						arr[i][j] = temp;
				}
			}
			start++;
			end--;
			temp--;
 		}
 		for(int i=0;i<size;i++)
 		{
 			for(int j=0;j<size;j++)
 			{
 				System.out.print(arr[i][j]);
 			}
 			System.out.println();
 		}		
	}
}
//Input:
//Enter the number : 5
//Output:
//5 5 5 5 5 5 5 5 5
//5 4 4 4 4 4 4 4 5
//5 4 3 3 3 3 3 4 5
//5 4 3 2 2 2 3 4 5
//5 4 3 2 1 2 3 4 5
//5 4 3 2 2 2 3 4 5
//5 4 3 3 3 3 3 4 5
//5 4 4 4 4 4 4 4 5
//5 5 5 5 5 5 5 5 5
