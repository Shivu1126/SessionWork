package Nested;
import java.util.*;
public class DoubleTheNumber_and_Find_Target {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value...");
		int value=s.nextInt();
		System.out.println("Enter the target...");
		int targetValue=s.nextInt();
		int tot=0;
		int i=1;		//This i is specify the position like a index.
		while(true)
		{
			tot=tot+value;		//Sum of value...
			if(i==targetValue)
				break;			//If i and targetValue is equal..The loop is break.
			value*=2;			//Double the value
			i++;				//i is increment by 1.
		}
		System.out.println(targetValue+"th value is "+value);
		System.out.println("Sum of value "+tot);
		s.close();
	}
}
