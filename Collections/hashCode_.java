package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class hashCode_ {
	String name;
	int id;
	public hashCode_(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		
		hashCode_ e1=new hashCode_("shivv",115);
		hashCode_ e2=new hashCode_("shiva",112);
		
		Set employees = new LinkedHashSet();
		
		employees.add(e1);
		employees.add(e2);
		
		System.out.println(employees);
			
		
		
	}
	
	//@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		hashCode_ other = (hashCode_) obj;
		if (id != other.id)
			return false;
		
		return true;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id+"]" ;
	}
	
}
