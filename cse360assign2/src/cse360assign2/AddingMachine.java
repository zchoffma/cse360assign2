/*	Author:  	Zachary Hoffmann
 * 	ASU ID:  	1214623033
 * 	Assignment: #2
 * 
 * 	Description:
 * 		Contains Adding machine class that adds and subtracts
 * 		from a total number within. 
 * 
 */
package cse360assign2;


/*
 * Contains the total value of the adding machine, a string that 
 * keeps track of the operation history, and can be reset by using 
 * the clear() function.  
 */
public class AddingMachine {
	private int total;
	
	
	/*
	 * Class constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/*
	 *  returns the total value of the adding machine
	 *  
	 *  @return int
	 */
	public int getTotal () {
		return 0;
	}
	
	/*	adds the passed in int argument to the total
	 * 
	 * @argument int
	 */
	public void add (int value) {
		
	}
	
	/*	subtracts the passed in int argument to the total
	 * 
	 * @argument int
	 */
	public void subtract (int value) {
		
	}
	
	/* Returns the history of the adding machine in string format
	 * 
	 * @return string
	 */
	public String toString () {
		return "";
	}
	
	/*	Resets the value of the adding machine to 0 and
	 * 	clears the history string by setting it to ""
	 * 
	 */
	public void clear() {
		
	}
}
