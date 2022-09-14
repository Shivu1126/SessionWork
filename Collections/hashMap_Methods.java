package Map;

import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Set;

public class hashMap_Methods {

	public static void main(String[] args) {
		
		// It is not implements in collection. 		
		// A collection that contains elements as key value pairs
		// No duplicate keys.
		// Can be access by iterator or by key.
		// can't access by position
		// initial capacity 11.
		
		HashMap<Integer,String> mapHash = new HashMap<>();
		
		mapHash.put(1, "shiv");		//value inserted
		mapHash.put(2, "james");
		mapHash.put(4, "vk");
		mapHash.put(3, "msd");

		System.out.println(mapHash.get(3));
		//it will return the value by key..key is not present its return 
		System.out.println(mapHash);
		
		mapHash.put(4, "kholi");
		System.out.println(mapHash);		
		//if you put already in key..it will replace the value at specific key.
		
		mapHash.putIfAbsent(5, "dhoni");
		System.out.println(mapHash);
		//this method check the key.. if it is present..ignore the method..
		//else key is absent the key and value is stored in a map..
		
		mapHash.replace(3, "hello");
		System.out.println(mapHash);
		//it will replace the value at specific key.if key is absent it will ignore
		
		System.out.println(mapHash.replace(5, "dhoni", "hey.."));
		//this method will check the key 1st..then if it is absent return false
		//else it is present...then check the value as same value..if it is not equals..return false
		//else it is equals...then replace the old value by new value.
		System.out.println(mapHash);
		
		mapHash.remove(3);
		System.out.println(mapHash);
		//it is remove the key and value from map...if key is absent it will ignore
		
		System.out.println(mapHash.remove(2, "james"));
		System.out.println(mapHash);
		//this method will check the key 1st..then if it is absent return false
		//else it is present...then check the value as same value..if it is not equals..return false
		//else it is equals...then it is remove the key and value from map.
		
		
		System.out.println(mapHash.containsKey(5));
		//it will return true when the key is found..else return false
		System.out.println(mapHash.containsValue("shiv"));
		//it will return true when the value is found..else return false

		//access by for each loop
		for(Entry<Integer,String> elements: mapHash.entrySet())
		{
			System.out.println(elements);
		}
		
		//print key only
		Set<Integer> keys = mapHash.keySet();
		System.out.println(keys);
		//print key and values
		for(Integer key:keys)
		{
			System.out.println("key = "+key+" value = "+mapHash.get(key));
		}
		System.out.println();
		
		//print value only
		Set<Entry<Integer, String>> values = mapHash.entrySet();
		for(Entry<Integer, String> v: values)
		{
			System.out.println(v.getValue());
		}
		
	}
}
	//HashTable is like as HashMap.
	//				 HashMap	HashTable
	//synchronized : No			Yes
	//Thread Safe  : No			Yes
	//NullKey and 
	//    NullValue: Only one   No
	//				 null key 
	//				 and null
	//				 value.
	//	Performance: Fast		Slow.Bcuz of thread
	//	capacity   : 16			11
	
	// synchronizedMap like a synchronizedList.
	//Map elements are stored a memory.That memory called bucket.the values stored by hashCode
	
	/*
	 * storing function
	 * put(K k,V v)
	 * {
	 * 		hash(k);		//This is generate a one code
	 * 		index=hash & (n-1);	//it is return the stored index.n means size.
	 * }
	 * 
	 * Data Stored like key-hashcode-value.All methods works via hashcode.
	 * If index are same...its stored like a Linked list
	 * 
	 */
