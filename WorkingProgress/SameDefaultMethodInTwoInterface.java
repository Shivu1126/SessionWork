package JavaWorking;

public class SameDefaultMethodInTwoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LikeAsMain called = new LikeAsMain();
		called.sameMethod();
	}

}

class LikeAsMain implements FirstInterface, SecondInteface
{
	/*Duplicate default methods named sameMethod with the parameters () and () are inherited from 
	the types SecondInteface and FirstInterface*/
	//So we override a method.
	
	@Override
	public void sameMethod() {
		FirstInterface.super.sameMethod();
		SecondInteface.super.sameMethod();
	}
	
	
	
}

interface FirstInterface
{
	default void sameMethod()
	{
		System.out.println("First interface method called.");
	}
}
interface SecondInteface
{
	default void sameMethod()
	{
		System.out.println("Second interface method called.");
	}
}