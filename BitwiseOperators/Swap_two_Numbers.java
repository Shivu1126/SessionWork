package BitwiseOperators;

public class Swap_two_Numbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swap...a = "+a+" b = "+b);
		
		/*
		 * XOR TABLE
		 * 
		 * a  b  a^b
		 * 0  0	  0
		 * 0  1   1
		 * 1  0	  1
		 * 1  1	  0
		 * 
		 */
		
		a=a^b;
		
		/* a=a^b -->  a = 10 ^ 20
		 * 
		 * 10 ->  01010 
		 * 20 ->  10100
		 * ------------
		 * 	^	  11110   ->  30
		 * 
		 * Now a = 30;	
		 */
		
		b=a^b;
		
		/*
		 * b=a^b -->  b = 30 ^ 20
		 * 
		 * 30 ->  11110 
		 * 20 ->  10100
		 * ------------
		 * 	^	  01010   ->  10
		 * 
		 * Now b=10;
		 */
		
		
		
		a=a^b;
		/*
		 * a=a^b -->  a = 30 ^ 10
		 * 
		 * 30 ->  11110 
		 * 10 ->  01010
		 * ------------
		 * 	^	  10100   ->  20
		 * 
		 * Now a=20;
		 */
		System.out.println("After swap...a = "+a+" b = "+b);

	}

}
