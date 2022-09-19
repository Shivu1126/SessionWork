package JavaWorking;

class Shiv
{
	void display()
	{
		System.out.println("shiv is printed");
	}
}

class Siva extends Shiv
{
	void display()
	{
		System.out.println("Siva is printed");
	}
}


public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shiv s1 = new Siva();		//Dynamic binding
		s1.display();		//If method name same its called the child class method.else parent class method called.
		
		
		Shiv s2 = new Shiv();
		s2.display();
		
		
		Shiv s3 = new Shiv()	//Anonymous class. No classes only method. It is used for override the method.
				{
					void display()
					{
						System.out.println("Heyy will printed...");
					}
				};
		s3.display(); // it is called to a anonymous method. Must used this..when called a anonymous class.
				
		// it is used for one time only called a method.
			
		Shiv s4 = new Shiv();
		s4.display();
	}

}
