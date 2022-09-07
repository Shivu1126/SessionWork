package Nested;

import java.math.BigInteger;

public class Chess_Find_Total_rice {

	public static void main(String[] args) {
		BigInteger value=new BigInteger("1");
		BigInteger  dub=new BigInteger("2");
		int targetValue=64;
		int i=0;		//This i is specify the position like a index.
		while(i!=targetValue)
		{
			value=dub.multiply(value);			//Double the value
			i++;				//i is increment by 1.
		}
		System.out.println("64th box value is "+value);
	}

}
