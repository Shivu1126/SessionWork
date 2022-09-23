package JavaWorking;

import java.util.HashMap;

public class DiffBetweenEqualsAndDoubleEqualed_In_HashMap {

	public static void main(String[] args) {

		myHashMap h1 = new myHashMap("Heyy.",2);
		myHashMap h2 = new myHashMap("Heyy..",1);
		
		System.out.println(h1.equals(h2));
		System.out.println(h1==h2);
		
	}
}
class myHashMap
{
	String key;
	int value;
	public myHashMap(String key, int value) {
		this.key = key;
		this.value = value;
		
	}

	
	
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + value;
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
		myHashMap other = (myHashMap) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value != other.value)
			return false;
		return true;
	}


}
