package JavaWorking;

public class PolymorphismMethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly p = new morphis();
		p.check();
	}
	
}
class poly
{
	public static void check()
	{
		System.out.println("poly...");
	}
}
class morphis extends poly
{
	public static void check()
	{
		System.out.println("morphis....");
	}
}