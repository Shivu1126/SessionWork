package problemSolving.balasantask;

import java.util.ArrayList;
import java.util.Scanner;

public class FrstMaxFrstMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysMinMax start = new ArraysMinMax();
		start.init();
	}
}
class ArraysMinMax
{
	private Scanner scanner = new Scanner(System.in);
	protected void init()
	{
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter size...");
		int size = scanner.nextInt();
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			list.add(scanner.nextInt());
		}
		while(!list.isEmpty())
		{
			
			int max = list.get(0);
			int min = list.get(0);
			int maxIndex=0;
			int minIndex=0;
			
			for(int i=0;i<list.size();i++)
			{
				if(max<list.get(i))
				{
					max = list.get(i);
					maxIndex = i;
				}
				if(min>list.get(i))
				{
					min = list.get(i);
					minIndex = i;
				}
			}
			if(list.size()!=1)
				System.out.print(min +" "+ max+" ");
			else
				System.out.print(min);
			list.remove(minIndex);
			if(!list.isEmpty())
			{
				if(minIndex>maxIndex)
					list.remove(maxIndex);
				else
					list.remove(maxIndex-1);
			}	
//			System.out.println(list);
		}
	}
}