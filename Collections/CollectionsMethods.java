package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsMethods {

	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<>();
		List<String> list2 = new LinkedList<>();
		List<Integer> list3 = new LinkedList<>();


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
		/*frequency() is count the specific value...return the int value.
		 */
		
		list3.add(10);
		list3.add(40);
		list3.add(10);
		list3.add(13);
		System.out.println(Collections.max(list3));
		//max() is return the maximum value of list
		System.out.println(Collections.min(list3));
		//min() is return the minimum value of list
		
		Collections.replaceAll(list3,50,30);
		System.out.println(list3);
		/*replaceAll(listName,oldValue,newValue) is replace the old value to new value in list.
		 * if you give the value..that value not present in list..this method not consider...*/
		
		Collections.reverse(list3);
		System.out.println(list3);
		// reverse() is reverse the list at the same list*/
		
		Collections.shuffle(list3);
		System.out.println(list3);
		// shuffle() is collapsed the list elements at the same list
		
		Collections.sort(list3);
		System.out.println(list3);
		//sort() is sort the list in ascending order
		
		Collections.swap(list3, 0, 2);
		System.out.println(list3);
		//swap(listName, pos1, pos2) is swap the value in pos1 to pos2.
		//It is throw the exception when the index is not found.
		
	}

}
