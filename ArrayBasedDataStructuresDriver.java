/**
 * 
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Data Structures: ArrayList-like Structures, Stacks, and Queues;
 *             ArrayBasedDataStructuresDriver class
 * @date 10/25/20
 */

/**
 * 
 * @version 1.0 The ArrayBasedDataStructuresDriver class test driver program
 *          below tests the ArrayList, Queue, and Stack classes and methods
 *
 */
public class ArrayBasedDataStructuresDriver {

	/**
	 * This main method tests each of the methods that correlate with each of the
	 * Stack, Queue, ArrayList classes by calling them in the main method and
	 * distinguishes between the testing of each class using the println statements
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Stack Testing---------------->>>>>>");
		stackTests();
		System.out.println("Queue Testing---------------->>>>>>");
		queueTests();
		System.out.println("ArrayList Testing---------------->>>>>>");
		arrayListTests();
	}

	/**
	 * A method is made to test the ArrayList methods and class by creating two
	 * ArrayList objects and calling the ArrayList methods on them.
	 */
	private static void arrayListTests() {
		// creates two objects of ArrayList
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();

		// testing the insert method by inserting Objects into the first ArrayList
		// object at certain indexes
		a.insert('B', 0);
		a.insert('A', 0);
		a.insert('T', 1);

		// testing the insert method by inserting Objects into the second ArrayList
		// object at certain indexes
		b.insert('B', 0);
		b.insert('A', 0);
		b.insert('T', 1);

		// printing the toString method statement for both ArrayList objects
		System.out.println(a.toString());
		System.out.println(b.toString());

		// checks if both ArrayList objects are equal by calling the equals method and
		// printing the result, printing a statement that tests ArrayList a
		// objects size by calling the size method, checking the index of an Object in
		// ArrayList a object by calling the indexOf method of ArrayList,
		// getting the Object at a specific element in ArrayList a and printing it by
		// calling the ArrayList class get method
		System.out.println(a.equals(b));
		System.out.println("The Size of ArrayList a is: " + (a.size()));
		System.out.println("The index of the character A is: " + a.indexOf('A'));
		System.out.println("The Object at the Index 2 in ArrayList a is: " + a.get(2));

		// removing the elements of Objects in the ArrayList a object by using the
		// isEmpty, size, and remove method in the ArrayList class.
		while (a.isEmpty() == false && a.size() > 0) {
			System.out.println("Item removed from ArrayList a: " + a.remove(0));
		}

		// checks to see if ArrayList a is empty by using the isEmpty method in
		// the ArrayList class
		System.out.println("Is ArrayList a empty: " + a.isEmpty());

	}

	/**
	 * A method is made to test the Queue methods and class by creating two Queue
	 * objects and calling the Queue methods on them.
	 */
	private static void queueTests() {

		// creates two objects of Queue
		Queue a = new Queue();
		Queue b = new Queue();

		// testing the enqueue method by enqueueing Objects into the first Queue
		// object
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');

		// testing the enqueue method by enqueueing Objects into the second Queue
		// object
		b.enqueue('C');
		b.enqueue('a');
		b.enqueue('t');

		// printing the toString method statement for both Queue objects
		System.out.println(a.toString());
		System.out.println(b.toString());

		// Checks to see if the two queue objects are equal by calling the queue equals
		// method and checking the size of Queue a by calling the queue method size
		System.out.println(a.equals(b));
		System.out.println("The Size of the Queue a is: " + a.size());

		// removing the elements of Objects in the Queue a object by using the
		// isEmpty, size, and dequeue method in the Queue class.
		while (a.isEmpty() == false && a.size() > 0) {
			System.out.println("Dequeueing Queue a: " + a.dequeue());
		}

		// checks to see if Queue a is empty by using the isEmpty method in
		// the Queue class
		System.out.println("Is Queue a empty: " + a.isEmpty());
	}

	/**
	 * A method is made to test the Stack methods and class by creating two Stack
	 * objects and calling the Stack methods on them.
	 */
	private static void stackTests() {

		// creates two objects of Stack
		Stack a = new Stack();
		Stack b = new Stack();

		// testing the push method by pushing Objects into the first Stack
		// object
		a.push('B');
		a.push('a');
		a.push('t');

		// testing the push method by pushing Objects into the first Stack
		// object
		b.push('C');
		b.push('a');
		b.push('t');

		// printing the toString method statement for both Stack objects
		System.out.println(a.toString());
		System.out.println(b.toString());

		// Checks to see if the two Stack objects are equal by calling the stack equals
		// method and checking the size of the stack b by calling the stack size method
		System.out.println(a.equals(b));
		System.out.println("The Size of the Stack b is: " + b.size());

		// removing the elements of Objects in Stack b by using the
		// isEmpty and pop method in the Stack class.
		while (b.isEmpty() == false) {
			System.out.println("Popping Object out of Stack b: " + b.pop());
		}

		// checks to see if Stack a is empty by using the isEmpty method in
		// the Stack class
		System.out.println("Is Stack a empty: " + a.isEmpty());
	}
}
