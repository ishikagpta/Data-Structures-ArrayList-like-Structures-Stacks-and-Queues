/**
 * 
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Data Structures: ArrayList-like Structures, Stacks, and Queues;
 *             Stack class
 * @date 10/25/20
 */

/**
 * 
 * @version 1.0 This Stack class will use an ArrayList class object to make a
 *          stack interface and store stack objects to perform different
 *          functions with
 *
 */
public class Stack {
	// Object named val of class ArrayList is created to store the stack Objects
	public ArrayList val = new ArrayList();
	// Instance variable amtOfValues keeps track of the amount of stack Objects
	// stored
	int amtOfValues = 0;

	/**
	 * Pushes an Object into the stack by inserting it into the Arraylist object at
	 * the end of the stack creating a stack interface and incrementing amtOfValues
	 * to keep track of a new Object added into the stack
	 * 
	 * @param ob
	 */
	public void push(Object ob) {
		this.val.insert(ob, amtOfValues);
		amtOfValues++;
	}

	/**
	 * This method first saves the first Object in the stack stored in the ArrayList
	 * object in the local variable Object ob by using the get method in the
	 * ArrayList class . It then removes the first Object of the stack stored in the
	 * ArrayList object by using the ArrayList class method remove and returns the
	 * first Object value stored in the local variable Object ob. It also decrements
	 * the value of the instance variable amtOfValues keeping track of the amount of
	 * Stack objects as an object has been removed.
	 * 
	 * @return ob
	 */
	public Object pop() {
		Object ob = this.val.get(amtOfValues - 1);
		this.val.remove(amtOfValues - 1);
		amtOfValues--;
		return ob;
	}

	/**
	 * This method returns the size of the stack by returning the amtOfValues
	 * instance variable that keeps track of the amount of objects in the stack
	 * 
	 * @return amtOfValues
	 */
	public int size() {
		return this.amtOfValues;
	}

	/**
	 * This toString method returns a String form of the stack from the beginning of
	 * the stack till the end of the stack stored in the ArrayList object using the
	 * ArrayList class toString method
	 */
	public String toString() {
		return this.val.toString();
	}

	/**
	 * This method checks to see if the stack stored in the ArrayList object is
	 * empty by calling the ArrayList class method isEmpty. If it is empty, it
	 * returns true else it returns false
	 * 
	 * @return true, false
	 */
	public boolean isEmpty() {
		return this.val.isEmpty();
	}

	/**
	 * This method checks to see if the current Stack stored in the ArrayList object
	 * is equal to a given Object in the argument by casting and setting the Object
	 * equal to a Stack first. Then, it checks if the toString and size match for
	 * both of them. If they do, they are equal and the return value is true.
	 * Otherwise, they are not and the return value is false.
	 * 
	 * @param obj
	 * @return true, false
	 */
	public boolean equals(Object obj) {
		Stack ob = (Stack) obj;
		if ((this.val.toString() == ob.toString()) && (this.val.size() == ob.amtOfValues)) {
			return true;
		} else {
			return false;
		}
	}
}