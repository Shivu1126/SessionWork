package Collection;

import java.util.Stack;

public class Stack_Methods {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		stack.add(11);
		stack.add(18);	
		System.out.println(stack);
		System.out.println(stack.get(0));

		stack.add(2,13);
		//we add the value at end of the stack,and also replace the value using index.
		//but we don't add a value at end+1.this is throw the exception.		
		System.out.println(stack.get(2));
		
		stack.push(10);
		System.out.println(stack);
		//this is push the element at the end of the stack
		
		
		System.out.println(stack.pop());
		System.out.println(stack);
		//this method remove the last element and return that element.
		//if stack is empty its throw the exception.
		
		System.out.println(stack.peek());
		//this is return the last element
		
		System.out.println(stack.search(13));
		//it is search from the top(last in) and return the distance(search count)
		//if element is not found return the -1.
		
		}
	//Note : It is also accept some list methods.
}
