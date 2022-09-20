package JavaWorking;

public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		polymorphism p = new polymorphism();
		p.check();
		p.check(5,5);
	}

}
class polymorphism
{
	public void check()
	{
		System.out.println("poly...");
	}

	public void check(int i, int j) 
	{
		System.out.println("overload..."+(i+j));
	}
}
