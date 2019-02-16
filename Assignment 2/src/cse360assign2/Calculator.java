/**
 * @author Andrew Jones
 * @classID 427
 * @assignmentNumber 2
 * 
 * This class acts as a calculator. It is able to do calculations such as
 * add, subtract, multiply and divide. All calculations are computed on the
 * running total which it initialized to zero. History is tracked with values all 
 * operations done on the running total. 
 * 
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history;

	public Calculator() {
		total = 0; 
		history = "0";
	}

	/**
	 * This getter method returns the current total
	 * 
	 * @return running total of all calculations
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * This method adds an integer value to the running total 
	 * Updates history with "+" and the value
	 * 
	 * @param value value which is added to the total
	 */
	public void add(int value) {
		total += value;
		updateHistory("+", value);
	}

	/**
	 * This method subtracts an integer value from the running total 
	 * Updates history with "-" and the value
	 * 
	 * @param value value to be subtracted from the total
	 */
	public void subtract(int value) {
		total -= value;
		updateHistory("-", value);
	}

	/**
	 * This method multiplies an integer value by the running total 
	 * Updates history with "*" and the value
	 * 
	 * @param value value which the total is multiplied by
	 */
	public void multiply(int value) {
		total *= value;
		updateHistory("*", value);
	}

	/**
	 * This method divides the running total by an integer value If the value passed
	 * in is zero, the total is set to zero, else normal integer division is applied
	 * Updates history with "/" and the value
	 * 
	 * @param value value which the total is divided by
	 */
	public void divide(int value) {
		if (value == 0)
			total = 0;
		else
			total /= value;
		updateHistory("/", value);
	}

	/** 
	 * This method concatenates the history string with all of the calculations that
	 * are passed in
	 * 
	 * @param operation string to hold operation type, ie +,-,*,/
	 * @param value     integer value that was computed with the total
	 */
	private void updateHistory(String operation, int value) {
		history += " " + operation + " " + value;
	}

	/**
	 * This method returns a string of all calculations done on the total
	 * 
	 * @return hisory of all operations with concurrent values
	 */
	public String getHistory() {
		return history;
	}

}