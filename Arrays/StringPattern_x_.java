package Arrays;
import java.util.*;
public class StringPattern_x_ {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String...");
		String str=s.next();
		s.close();
		
		if(str.length()%2==0)
		{
			System.out.println(0);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i==j || i+j==str.length()-1)
					System.out.print(str.charAt(j));			
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
