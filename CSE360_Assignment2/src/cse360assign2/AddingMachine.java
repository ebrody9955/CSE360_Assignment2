/*
 * Ethan Brody
 * CSE 360
 * Assignment 2 AddingMachine
 */
package cse360assign2;

public class AddingMachine {

	
	/*
	 * Added a private string for history
	 */
	private int total;
	private String history = "0";
	
	/*
	 * No Changes Made
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * No Changes Made
	 */
	public int getTotal () {
		return 0;
	}
	
	/*
	 * Added a method that adds the current parameter
	 * to the total and a method that adds that action
	 * to the history
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/*
	 * Added a method that subtracts the current 
	 * parameter from the total and a method 
	 * that adds that action to the history
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/*
	 * Added a method that returns the current history string
	 */	
	public String toString () {
		return history;
	}
	
	/*
	 * This wasn't asked for but I assumed the
	 * clear function would be used to reset the
	 * current history and total
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
	
}