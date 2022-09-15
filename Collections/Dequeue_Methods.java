package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue_Methods {

	public static void main(String[] args) {
		
		Deque<Integer> dqMethods1 = new LinkedList<>();
		dqMethods1.add(1);		
		dqMethods1.add(12);		
		dqMethods1.add(123);		
		dqMethods1.add(1234);		
		dqMethods1.add(12345);//add the element
		
		System.out.println(dqMethods1);
		
		dqMethods1.addAll(dqMethods1);
		//It will add the all elements one list to another list.
		System.out.println(dqMethods1);
		
		dqMethods1.clear();//clear the all element
		System.out.println(dqMethods1);
		
		dqMethods1.addFirst(11);
		dqMethods1.addFirst(12);
		dqMethods1.addFirst(13);
		dqMethods1.addFirst(14);
		dqMethods1.addFirst(15);
		//The values are add at the head(first)
		System.out.println(dqMethods1);
		
		dqMethods1.addLast(1);
		dqMethods1.addLast(2);
		dqMethods1.addLast(3);
		dqMethods1.addLast(4);
		dqMethods1.addLast(5);
		//The values are add at the tail(end)
		System.out.println(dqMethods1);
		
		System.out.println(dqMethods1.peek());//return the first element.if empty return null.
		System.out.println(dqMethods1.peekFirst());//return the first element.if empty return null.
		System.out.println(dqMethods1.peekLast());//return the last element.if empty return null.
		
		System.out.println(dqMethods1.poll());//Remove first element.if empty return null.
		System.out.println(dqMethods1);
		System.out.println(dqMethods1.pollFirst());//Remove first element.if empty return null.
		System.out.println(dqMethods1.pollLast());///Remove last element.if empty return null.
		System.out.println(dqMethods1);
		
		dqMethods1.offer(111);//The values are add at the end(last)
		dqMethods1.offerFirst(222);//The values are add at the head(first)
		dqMethods1.offerLast(333);//The values are add at the tail(end)
		System.out.println(dqMethods1);
		
		
		dqMethods1.pop();	//It is also support linked list..bcuz we extends linked list
		System.out.println(dqMethods1);
		dqMethods1.push(50); // push at head.
		System.out.println(dqMethods1);
		
	}

}
