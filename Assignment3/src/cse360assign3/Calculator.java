package cse360assign3;

/**
 * Class that acts much like a calculator. It keeps a total variable. We can use the
 * methods to do arithmetic operations (+,-,*,/) one at a time and return the total new value.
 * It also allows us to print the history of commands entered.
 * 
 * @author Mauricio Gutierrez for CSE 360, PIN: 402
 * @version February 22, 2016
 * 
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Constructor: 
	 * Creates our calculator object with total variable initialized to 0 and history initialized to "0" string.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; //initial value
	}
	
	/**
	 * getTotal - returns the total variable stored in the calculator.
	 * 
	 * @return total - The total value after we have done all desired operations
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add - adds the parameter to the total variable.
	 * Keeps track of operation in history string variable.
	 * 
	 * @param value - The value to be added to our total
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * subtract - subtracts the parameter from the total variable.
	 * Keeps track of operation in history string variable.
	 * 
	 * @param value - The value to be subtracted from the total variable
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * multiply - multiplies the total variable by the parameter given.
	 * Keeps track of operation in history string variable.
	 * 
	 * @param value - The value to be multiplied by
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * divide - divides the total variable by the given parameter. It uses integer division.
	 * If the parameter is zero, then it sets total to zero, does not return an error message.
	 * Keeps track of operation in history string variable.
	 * 
	 * @param value - The value to be divided by
	 */
	public void divide (int value) {
		if(value == 0) // set total to 0 if we divide by 0
			total = 0;
		else
			total = total / value;
		history = history + " / " + value;
	}
	
	/**
	 * getHistory - returns the history of all the actions as a string. The history starts with
	 * the initial 0 value and proceeds in order to the last input. There is no limit to the size 
	 * of the string. All operations and values are separated by a space. 
	 * 
	 * @return history - the string showing operations and values performed in order.
	 */
	public String getHistory () {
		return history;
	}
}