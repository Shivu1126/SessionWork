package Arrays;
import java.util.*;
public class grandChildren_Count {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String details[][]= { //{childName,fatherName}
				
								{"Luke","Shaw"},
								{"Wayne","Rooney"},
								{"Rooney","Ronaldo"},
								{"Shaw","Rooney"}
								
							};
		
		System.out.println(Arrays.deepToString(details));
		
		System.out.println("Enter the Name...");
		String name=s.next();
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(details[i][1].equals(name))
			{
				for(int j=0;j<4;j++)
				{
					if(details[i][0].equals(details[j][1]))
					{
						count++;
					}
				}
			}
		}
		
		System.out.println("The number of grandChidrens..."+count);
		
		s.close();
	}

}
