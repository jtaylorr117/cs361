/**
 * 
 */
package mystack;

/**
 * @author John Taylor
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		theStack = (theStack).next;
		return (T) (theStack).next;
	}

	public void push(T v) {
		// TODO To complete
		MyNode temp = new MyNode(null, null);
		temp.val = v;
		temp.next = theStack;
		theStack = temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5

		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(5);

		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name

		MyStack<Person> personStack = new MyStack<Person>();
		Person johnPerson = new Person();
		johnPerson.setFname("John");

		Person drScharff = new Person();
		drScharff.setFname("Dr. Scharff");

		personStack.push(johnPerson);
		personStack.push(drScharff);

		System.out.println("Success!");
	}

}
