/*
 *  2. Create a Java class called MinStack of Integers 
 *  that supports standard stack operations (push, pop, top, and isEmpty) and 
 *  also provides a getMin method that returns the minimum element in the stack.
 */

package lab_28_stackimplementation;// User Defined Package declaration

// class declaration
class Operation {

	int top=0;// stack index number
	int [] stackarray = new int[5];// create a new stack array
	int maxSize;// size of the stack
	// push()method to add values to the stack
	public void push(int value)
	{	// checks if the index number is equal to the size
		if(top==5)
		{
			System.out.println("Alert!!!  stack is Full");
		}
		else
		{
			// here value is assigned to array's 0th index
			stackarray[top]=value;
			// increment the index top value
			top++;}

	}
	
	// POP () method to remove the top element from the stack
	public int pop()
	{
		int value=0;
		// chacks if stack is empty
		if (isEmpty())
		{System.out.println("Stack is Empty");}
		// take the value to be poped out
		else {

			// decrement the top index value
			top--;
			value = stackarray[top] ;}
		return value;
	}
	// Peek() method to display the top element of the stack
	public int peek()
	{// show the top value
		int value;
		value = stackarray[top-1];
		return value;
		

	}
	// Size method to check the length of the stack
	public int size()
	{// top index is the actual size of the stack
		return top;
	}
	// here when we use "is" as in 'isEmpty' it will always return boolean value 
	public boolean isEmpty()
	{
		// returns the true or false by consition
		return top<=0;
	}

	public int getMin()
	{
		int min = stackarray[top-1];
		// Iterate over the main stack to find the minimum value
		for (int ele : stackarray) {
			if (ele < min) {
				min = ele;
			}
		}
		return min;
	}
}
// class declaration
public class MinStack {
	// main method
	public static void main(String[] args) {
		// create an object to the class operation
		Operation stack = new Operation();
		// obj.push()
		stack.push(10);
		stack.push(30);
		stack.push(25);
		stack.push(5);
		stack.push(19);
		stack.push(20);// Gives message as Stack is Full
		System.out.println("Size of the Stack : "+stack.size());

		System.out.println("Top element of the Stack : "+stack.peek());
		System.out.println("Minimum value of the stack : " +stack.getMin());
		// pop method to remove all the elements from the stack
		while (!stack.isEmpty()) {
			System.out.println("Popped: " + stack.pop());
		}
		// to display the size of the stack after removing all the elements
		System.out.println("Stack size after popping all elements: " + stack.size());
		// checking if the stack is empty 
		System.out.println("Is Stack is Empty : "+stack.isEmpty());        
	}
}
