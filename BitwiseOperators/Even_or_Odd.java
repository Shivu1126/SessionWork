package BitwiseOperators;
import java.util.*;
public class Even_or_Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value...");
		int n=s.nextInt();
		if((n&1)==1)			
			System.out.println("Odd");
		else
			System.out.println("Even");
		s.close();
	}	
}
/*
 * AND TABLE
 * 
 * a  b  a&b
 * 0  0   0
 * 0  1   0
 * 1  0   0
 * 1  1   1
 * 
 * If n=11...
 * 
 * n&1 -->  11 & 1
 * 
 * n ->  1011
 * 1 ->  0001
 * ----------
 * &	 0001	-> 1
 * 	
 * Value is 1..So It is ODD number...
 * 
 * If n=8...
 * 
 * n&1 -->  8 & 1
 * 
 * n ->  1000
 * 1 ->  0001
 * ----------
 * &	 0000	-> 0
 * 	
 * Value is not Equal 1...So It is Even number...
 */	