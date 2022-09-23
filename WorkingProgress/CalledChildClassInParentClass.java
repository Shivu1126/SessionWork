package JavaWorking;
public class CalledChildClassInParentClass {	
	public static void main(String[] args) 
	{
		parentClass p = new childClass();
		p.print();
	}
}
abstract class parentClass
{		
	abstract void println();
	void print()
	{
		println();
	}
}
class childClass extends parentClass
{
	void println()
	{
		System.out.println("println");
	}
}
