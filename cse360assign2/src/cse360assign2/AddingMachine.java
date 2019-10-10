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
	private String history;
	
	
	/*
	 * Class constructor
	 */
	public AddingMachine () {
		this.total = 0;  // not needed - included for clarity
		this.history = "0";
	}
	
	
	/*
	 *  returns the total value of the adding machine
	 *  
	 *  @return int
	 */
	public int getTotal () {
		return total;
	}
	
	/*	adds the passed in int argument to the total
	 * 
	 * @argument int
	 */
	public void add (int value) {
		this.total = this.total + value;
		this.history = this.history + " + " + value;
	}
	
	/*	subtracts the passed in int argument to the total
	 * 
	 * @argument int
	 */
	public void subtract (int value) {
		this.total = this.total - value;
		this.history = this.history + " - " + value;
	}
	
	/* Returns the history of the adding machine in string format
	 * 
	 * @return string
	 */
	public String toString () {
		return this.history;
	}
	
	/*	Resets the value of the adding machine to 0 and
	 * 	clears the history string by setting it to ""
	 * 
	 */
	public void clear() {
		this.total = 0;
		this.history = "0";
	}
}
