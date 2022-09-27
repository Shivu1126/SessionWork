package fourteGame;

import java.util.Scanner;

public class FourteGameTask {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Whole Number ");
		int wholeNumber = s.nextInt();
		
		System.out.println("Enter used numbers");
		int numberArr[] = new int[4];
		for(int i=0;i<4;i++)
			numberArr[i]=s.nextInt();
		
		char operators[]= {'+','-','/','*'};
		createEquation(operators, numberArr, wholeNumber);
		s.close();
	}
	
	private static void createEquation(char opertors[], int arrNum[],int wholeNumber)
	{
		String equation="";
		for(int i=0;i<opertors.length;i++)
		{	
			equation = equation + arrNum[0]+opertors[i]+arrNum[1]+opertors[i]+arrNum[2]+opertors[i]+arrNum[3];
			if(checkEquation(equation, wholeNumber))
			{
				System.out.println(equation);
				return ;
			}
			equation ="";
			
			for(int j=0;j<4;j++)
			{
				if(i!=j)
				{
					equation = equation + arrNum[0]+opertors[i]+arrNum[1]+opertors[i]+arrNum[2]+opertors[j]+arrNum[3];
					if(checkEquation(equation, wholeNumber))
					{
						System.out.println(equation);
						return ;
					}
				}
			}
			equation ="";

			for(int j=0;j<4;j++)
			{
				if(i!=j)
				{
					equation = equation + arrNum[0]+opertors[i]+arrNum[1]+opertors[j]+arrNum[2]+opertors[i]+arrNum[3];
					if(checkEquation(equation, wholeNumber))
					{
						System.out.println(equation);
						return ;
					}
				}
			}
			equation="";
			
			for(int j=0;j<4;j++)
			{
				if(i!=j)
				{
					equation = equation + arrNum[0]+opertors[j]+arrNum[1]+opertors[i]+arrNum[2]+opertors[i]+arrNum[3];
					if(checkEquation(equation, wholeNumber))
					{
						System.out.println(equation);
						return ;
					}
				}
			}
		}
		System.out.println(equation);
	}
	private static boolean checkEquation(String answer, int wholeNumber)
	{
		int sum =0;
		int number = 0;
		for(int i=0;i<answer.length();i+=2)
		{
			
			char numChar = answer.charAt(i);
			number = Integer.parseInt(String.valueOf(numChar));
			if(i==0)
				sum=number;
			if(i!=0)
			{
				char opertorChar = answer.charAt(i-1);
				if(opertorChar=='+')
					sum+=number;
				if(opertorChar=='-')
					sum-=number;
				if(opertorChar=='*')
					sum*=number;
				if(opertorChar=='/')
					sum/=number;
			}
		}
		if(wholeNumber==sum)
			return true;
		else
			return false;		
	}
}