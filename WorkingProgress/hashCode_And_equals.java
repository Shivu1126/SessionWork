package JavaWorking;

import java.util.HashMap;
import java.util.Map;

public class hashCode_And_equals {

	public static void main(String[] args) {
	
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(i1, "one");
		map2.put(i2, "one");
		
		System.out.println(map2.size());	//1
		//It is a wrapper class.
		//Wrapper classes has already implemented the hashcode and  equals method.
		//These methods already overridden to all the wrapper classes.
		
		
		Team t1 = new Team(1);
		Team t2 = new Team(1);
		Map<Team, String> map1 = new HashMap<>();
		map1.put(t1, "Shiv");
		map1.put(t2, "Shiv");
		
		System.out.println(map1.size());		//2(Not override a hashcode and equals)
		//It will print 2. Because t1 and t2 is a object. we store the object address as a key. 
		
		//How do overcome there..?
		
		Map<Team, String> map3 = new HashMap<>();
		map3.put(t1, "Shiv");
		map3.put(t2, "Shiv");
		
		System.out.println(map3.size());	//If override a hashcode and equals it will return 1.
		
	}
}


class Team
{
	int id;
	Team(int id)
	{
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}