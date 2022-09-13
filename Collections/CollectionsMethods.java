package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsMethods {

	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<>();
		List<String> list2 = new LinkedList<>();
		List<String> list3 = new LinkedList<>();


		list1.add("shiv");
		list1.add("hey..");
		list2.add("vk...");
		list2.add("hahaha...");
		
		Collections.addAll(list2,"kk","hello...");
		System.out.println(list2);
		//addAll() is add many element to mentioned list 
		
		
		
		Collections.copy(list2, list1);
		System.out.println(list2);
		/* copy() is copied the all elements of list1 and paste & replace the element
		 *in same index.It is throw the exception when it is list2_Size > list1_Size. */
		
		Collections.fill(list2,"hey..");
		System.out.println(list2);
		/*fill() is replaced the all elements with which element to fill the specified list.
		 * If list is empty...its return empty list*/
		
		System.out.println(Collections.frequency(list1, "hey.."));
		/*frequency() is count the specific value...return the int value.*/
	}

}
