package JavaWorking;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Member demo = new Students();	//We don't create a object for abstract method.
		demo.welcomeMessage();	
	//	System.out.println(demo.nameReturn());
		
		Teachers t1 = new Teachers();
		t1.welcomeMessage();
	//	System.out.println(s1.nameReturn());
		
		Member anonymous = new Member()	//we can use anonymous class for access the abstract class method.
				{
					@Override
					public void welcomeMessage() {
						System.out.println("Anonymous....");
					}					
					//@Override
//					public String nameReturn() {
//						return super.nameReturn();
//					}
				};
				
		anonymous.welcomeMessage();
		System.out.println(anonymous.nameReturn());
		
		
	}

}

abstract class Member
{
	 private String name = "Hii to all...";
	 public abstract void welcomeMessage();
	 public String nameReturn()
	 {
		 return name;
	 }
}

class Students extends Member 
{
	@Override
	public void welcomeMessage() {
		System.out.println("Welcome Student "+super.nameReturn());
		System.out.println();
	}
}

class Teachers extends Member
{	
	public void welcomeMessage() {
		System.out.println("Welcome Teachers "+super.nameReturn());
		System.out.println();
	}	
}
