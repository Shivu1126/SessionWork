package Nested;
import java.util.*;
public class Nested_if {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total mark..");
		int mark=s.nextInt();
		
		if(mark>=400)
		{
			if(mark>=450)			//This is called Nested-if (one if into the another if)
				System.out.println("(Group 1) Move to A Section");
			else
				System.out.println("(Group 1) Move to B Section");
		}
		else if(mark>=350)
			System.out.println("Move to Group 2 ");
		else
			System.out.println("Move to Group 3 ");
		s.close();
	}

}
