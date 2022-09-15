package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Methods {

	public static void main(String[] args) {
		//FIFO - First in First out
		//Queue is a interface.extends the collection.so some collection method is work.
		//Its like a linked list.
		//insert at end..get at first
		Queue<String> queueMethods=new LinkedList<>();

		queueMethods.add("hey...");
		System.out.println(queueMethods);
		System.out.println(queueMethods.contains("hello..."));
		queueMethods.offer("shiv..");
		queueMethods.offer("vk..");
		queueMethods.offer("james..");
		queueMethods.offer("jegan..");
		//offer() method is add at a end.
		System.out.println(queueMethods);
		
		System.out.println(queueMethods.poll());	
		//Remove first element.If queue is empty its return null.
		System.out.println(queueMethods);
		
		System.out.println(queueMethods.remove());
		//Its like a poll but if queue is empty its throw exception(NoSuchElementException).
		System.out.println(queueMethods);
		
		System.out.println(queueMethods.peek());
		//its return the 1st(head/first in) element.if queue is empty its return the null.
		
		System.out.println(queueMethods.element());
		//Its like a peek but if queue is empty its throw exception(NoSuchElementException).
		
		System.out.println(queueMethods.contains("jegan.."));
		//If element is into the queue its return true..else return false..
		
		System.out.println(queueMethods.toString());
		
		
		//If you want specific position value use iterator below code.
		Iterator iterator = queueMethods.iterator();
		int i=0;
		int target=1;
		String str="";
        while (iterator.hasNext())
        {
        	str=(String) iterator.next();
        	if(i==target)
        		break;
        	i++;
        }
        System.out.println(str);
	}

}
