package Exception;
public class TryCatch {

	public static void main(String[] args) {
			int a=10,b=0;
			int c;
			try
			{
				c=a/b;			//It is throw the Arithmetic exception..
				System.out.println(c);

			}
			catch(Exception e)	//We create the object to Exception class for catch the throw
			{
				System.out.println("Divisor is zero...");
			}
			
			
			int arr[]=new int[2];
			try 
			{
				arr[0]=10;
				arr[1]=20;
				System.out.println(arr[0]);
				arr[2]=5;		//It is throw the ArrayIndexOutOfBoundsException...
								//So Below line not executed
				System.out.println(arr[1]);
				System.out.println(arr[2]);
			}
			catch(Exception e) //We create the object to Exception class for catch the throw
			{
				System.out.println(arr[1]);
				System.out.println("Array index are 0 and 1...");
			}
	}

}
