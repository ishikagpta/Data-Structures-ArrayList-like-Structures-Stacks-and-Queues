/**
 * 
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Data Structures: ArrayList-like Structures, Stacks, and Queues;
 *             Queue class
 * @date 10/25/20
 */

/**
 * 
 * @version 1.0 This Queue class will use an ArrayList class object to make a
 *          queue interface and store queue objects to perform different
 *          functions with
 *
 */
public class Queue {

	// Object named val of class ArrayList is created to store the queue Objects
	public ArrayList val = new ArrayList();
	// Instance variable amtOfValues keeps track of the amount of queue Objects
	// stored
	int amtOfValues = 0;

	/**
	 * Enqueues an Object into the queue by inserting it into the Arraylist object
	 * at the end of the queue creating a queue interface and incrementing
	 * amtOfValues to keep track of a new Object added into the queue
	 * 
	 * @param ob
	 */
	public void enqueue(Object ob) {
		this.val.insert(ob, amtOfValues);
		amtOfValues++;
	}

	/**
	 * This method first saves the first Object in the queue stored in the ArrayList
	 * object in the local variable Object ob by using the get method in the
	 * ArrayList class . It then removes the first Object of the queue stored in the
	 * ArrayList object by using the ArrayList class method remove and returns the
	 * first Object value stored in the local variable Object ob. It also decrements
	 * the value of the instance variable amtOfValues keeping track of the amount of
	 * Queue objects as an object has been removed.
	 * 
	 * @return ob
	 */
	public Object dequeue() {
		Object ob = this.val.get(0);
		this.val.remove(0);
		amtOfValues--;
		return ob;
	}

	/**
	 * This method returns the size of the queue by returning the amtOfValues
	 * instance variable that keeps track of the amount of objects in the queue
	 * 
	 * @return amtOfValues
	 */
	public int size() {
		return this.amtOfValues;
	}

	/**
	 * This toString method returns a String form of the queue from the beginning of
	 * the queue till the end of the queue stored in the ArrayList object using the
	 * ArrayList class toString method
	 */
	public String toString() {
		return this.val.toString();
	}

	/**
	 * This method checks to see if the queue stored in the ArrayList object is
	 * empty by calling the ArrayList class method isEmpty. If it is empty, it
	 * returns true else it returns false
	 * 
	 * @return true, false
	 */
	public boolean isEmpty() {
		return this.val.isEmpty();
	}

	/**
	 * This method checks to see if the current Queue stored in the ArrayList object
	 * is equal to a given Object in the argument by casting and setting the Object
	 * equal to a Queue first. Then, it checks if the toString and size match for
	 * both of them. If they do, they are equal and the return value is true.
	 * Otherwise, they are not and the return value is false.
	 * 
	 * @param ob
	 * @return true, false
	 */
	public boolean equals(Object ob) {
		Queue other = (Queue) ob;
		if ((this.val.toString() == other.toString()) && (this.val.size() == other.amtOfValues)) {
			return true;
		} else {
			return false;
		}
	}
}