package level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DescOrderFreq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Descending start = new Descending();
		start.init();
	}

}
class Descending
{
	private Scanner scanner = new Scanner(System.in);
	protected void init() {
		HashMap<Integer, Integer> values = new HashMap<>();
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		System.out.println("Enter the values");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
			values.put(arr[i],values.getOrDefault(arr[i],0)+1);
		}
		int arrVal[]=new int[size];
		int valCount[]=new int[size];
		int totalVal=0;
		for(Map.Entry<Integer, Integer> map: values.entrySet())
		{
			arrVal[totalVal]=map.getKey();
			valCount[totalVal]=map.getValue();
			totalVal++;
		}
		sortAndPrinArray(arrVal,valCount,totalVal);
		
	}
	private void sortAndPrinArray(int[] arrVal, int[] valCount, int totalVal) 
	{
		
		if(checkFreqSame(valCount,totalVal))
		{
			//Arrays.sort(arrVal);
			for(int i=0;i<totalVal;i++)
			{
				for(int j=0;j<totalVal;j++)
				{
					if(arrVal[i]<=arrVal[j])
					{
						int temp1=arrVal[i];
						arrVal[i]=arrVal[j];
						arrVal[j]=temp1;
					}
				}
			}
			//System.out.println(Arrays.toString(arrVal));
			for(int k=0;k<totalVal;k++)
			{
				for(int j=0;j<valCount[0];j++)
				{
					System.out.print(arrVal[k]);
				}
			}
			return;
		}
		
		for(int i=0;i<totalVal;i++)
		{
			for(int j=0;j<totalVal;j++)
			{
				if(valCount[i]>=valCount[j])
				{
					int temp1=arrVal[i];
					arrVal[i]=arrVal[j];
					arrVal[j]=temp1;
					int temp2=valCount[i];
					valCount[i]=valCount[j];
					valCount[j]=temp2;
				}
			}
		}
		
		for(int i=0;i<arrVal.length;i++)
		{
			for(int j=0;j<valCount[i];j++)
			{
				System.out.print(arrVal[i]);
			}
		}

	}
	private boolean checkFreqSame(int[] valCount, int totalVal) {
		for(int i=1;i<totalVal;i++)
		{
			if(valCount[0]!=valCount[i])
				return false;
		}
		return true;
	}
}