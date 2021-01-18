/**
 * 
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Data Structures: ArrayList-like Structures, Stacks, and Queues;
 *             ArrayList class
 * @date 10/25/20
 */

/**
 * @version 1.0 This ArrayList class will create methods which will give
 *          resemblance to an ArrayList like structure of objects by using
 *          Arrays.
 */

public class ArrayList {

	// values is an array of objects to help store values/elements in the ArrayList
	// for operations
	Object values[] = new Object[1];
	// amtOfValues is an instance variable to keep track of the amount of
	// elements/values in
	// the values array of the ArrayList
	int amtOfValues = 0;

	/**
	 * This insert method takes a new element and the index it is meant to be
	 * inserted at and inserts it into the array of the ArrayList if the index is
	 * within the length of the array
	 * 
	 * @param obj
	 * @param index
	 */
	public void insert(Object obj, int index) {

		// This if method checks to see if the index is out of bounds of the values
		// array, if it is it simply returns
		if (index >= values.length || index < 0) {
			return;
		}

		// This currentValues array makes an array of the length of the values array + 1
		// to be able to add the new inserted element
		Object[] currentValues = new Object[values.length + 1];
		// creates a local variable z to be used in the for loop below
		int z = 0;

		// this for loop iterates through the currentValues array and sets it equal to
		// the values array. If the index of the currentValues array matches the index
		// given by the parameter, than it inserts the new element into the array at
		// that index
		for (int r = 0; r < currentValues.length; r++) {
			if (!(r == index)) {
				currentValues[r] = values[z];
				z++;
			} else {
				currentValues[r] = obj;
			}
		}

		// the original values array is then set to be equal to the currentValues array
		// which has the new element and is one size larger than the original values
		// array
		values = currentValues;
		// the instance variable amtOfValues is upped by one as one more element is
		// added to the values array
		amtOfValues++;
	}

	/**
	 * This indexOf method takes an object input and finds what index the object is
	 * at in the values array and returns it
	 * 
	 * @param ob
	 * @return b
	 */
	public int indexOf(Object ob) {
		// creates local variable b to store the index of the Object in the argument.
		// Initialized to
		// -1 in case index of the Object is not found.
		int b = -1;

		// this for loop iterates through the values array and if the Object input
		// equals the element at any of the indexes, the index is stored in b
		for (int z = 0; z < values.length; z++) {
			if (ob == values[z]) {
				b = z;
			}
		}

		// the index at which the Object is found at is returned, if index is not found
		// then -1 is returned
		return b;
	}

	/**
	 * This method returns the size of the values array storing the ArrayList by
	 * returning the instance variable amtOfValues keeping track of the amount of
	 * elements in the values array.
	 * 
	 * @return amtOfValues
	 */
	public int size() {
		return amtOfValues;
	}

	/**
	 * This method takes in an index as an argument and removes the Object at that
	 * index in the values array storing the ArrayList
	 * 
	 * @param index
	 * @return ob
	 */
	public Object remove(int index) {

		// this local Object variable will store the object at the given index and is
		// initially set to null in case the index is out of bounds
		Object ob = null;

		// checks to see if the index is within bounds of the values array storing the
		// ArrayList. If not, then it returns null.
		if (values == null || index < 0 || index >= values.length) {
			return ob;
		}

		// creates currentValues array of type Object that is one size less than the
		// length of the values array storing the ArrayList
		Object[] currentValues = new Object[values.length - 1];

		// sets the local variable ob Object to be equal to the element of the argument
		// index
		ob = values[index];

		// this for loop cycles through until one less than the index number and sets
		// the currentValues array equal to the values array storing the ArrayList
		for (int z = 0; z < index; z++) {
			currentValues[z] = values[z];
		}

		// this for loop circles through the index number until less than one less than
		// the length of the values array storing the ArrayList and sets the
		// currentValues array equal to the values array + 1 that stores the ArrayList
		for (int z = index; z < values.length - 1; z++) {
			currentValues[z] = values[z + 1];
		}

		// this sets the values array storing the ArrayList equal to the currentValues
		// array
		values = currentValues;

		// this subtracts one from the instance variable amtOfValues keeping track of
		// the elements in the values array since one element has been removed
		amtOfValues--;

		// this returns the Object removed at the given argument index
		return ob;

	}

	/**
	 * This method returns all the elements of the values array storing the
	 * ArrayList in one line as a String
	 */
	public String toString() {
		// creates an empty local String called elements
		String elements = "";

		// this for loop goes until it is one less than the instance variable
		// amtOfValues that keeps track of the amount of elements and adds each element
		// from the values array and a space between them into the elements String
		for (int z = 0; z < amtOfValues; z++) {
			elements = elements + values[z] + " ";
		}

		// this returns the String elements containing a String of all the elements in
		// the values array storing the ArrayList
		return elements;
	}

	/**
	 * This method checks to see if one object given in the argument is equal to the
	 * ArrayList stored in the values array
	 * 
	 * @param obj
	 * @return everyElement
	 */
	public boolean equals(Object obj) {

		// first casts and sets the object equal to ArrayList
		ArrayList ob = (ArrayList) obj;
		// creates a boolean to check to see if the two ArrayLists are equal. Initially
		// set to true.
		boolean everyElement = true;

		// this checks to see if the length of the values array storing the ArrayList is
		// the same as the size of the argument ArrayList. If it is it then goes into a
		// for loop that checks to see if every element in the argument ArrayList and
		// the values array storing ArrayList are equal. If not, everyElement is set to
		// false and is then returned as such. If it is, the initial value of true is
		// returned. If the two ArrayLists are not the same size, everyElement returns
		// and is set to false.
		if (this.values.length == ob.size()) {
			for (int z = 0; z < this.values.length; z++) {
				if (this.values[z] != (Object) ob.get(z)) {
					everyElement = false;
				}
			}
			return everyElement;
		} else {
			return everyElement = false;
		}

	}

	/**
	 * This method gets the Object of the ArrayList stored at the given index in the
	 * argument within the values array and returns it
	 * 
	 * @param index
	 * @return ob
	 */
	public Object get(int index) {

		// Object ob is a local variable that will store the Object at the given index
		// that is set to null initially
		Object ob = null;

		// checks to see if the index is within bounds of the values array containing
		// the ArrayList. If not, it returns null. If it is, it returns the element at
		// the given index in the values array containing the ArrayList
		if (index < 0 || index > amtOfValues) {
			return ob;
		} else {
			return ob = values[index];
		}
	}

	/**
	 * Checks to see if the values array containing the ArrayList is empty. If the
	 * instance variable amtOfValues keeping track of the amount of elements in the
	 * values array containing the ArrayList equals 0 then the method returns true
	 * for the array of ArrayLists being empty, otherwise it returns false.
	 * 
	 * @return true, false
	 */
	public boolean isEmpty() {
		return (amtOfValues == 0);
	}
}
