/**
 * 
 */
package reflection;

/**
 * @author John Taylor
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * 
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object Format of the output:
	 * Inheritance chain: Cn inherits from Cn-1 inherits ... inherits from
	 * java.lang.Object
	 * 
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.print("Inheritance Chain:: ");
		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Object newObject = o;
		System.out.print(newObject.getClass().getName());
		while (newObject.getClass().getSuperclass() != null) {
			if (newObject.getClass().getSuperclass().getName().equals("java.lang.Object")) {
				System.out.print(" inherits from " + newObject.getClass().getSuperclass().getName());
				break;
			}
			System.out.print(" inherits from " + newObject.getClass().getSuperclass().getName());
			newObject = newObject.getClass().getSuperclass();

		}
		System.out.println();
	}

	/**
	 * Print the list of methods of the object
	 * 
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.print("Methods:: ");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i].toString() + ", ");
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();

		// Demonstration of the methods on an objet of type String
		// TODO To complete
		System.out.println("String");
		String t1 = new String();
		r.correspondingClass(t1);
		r.inheritanceChain(t1);
		r.listMethods(t1);
		System.out.println();
		System.out.println();

		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete
		System.out.println("ColoredCircle");
		ColoredCircle c1 = new ColoredCircle();
		r.correspondingClass(c1);
		r.inheritanceChain(c1);
		r.listMethods(c1);
	}

}
