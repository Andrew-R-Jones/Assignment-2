/**
 * @author Andrew Jones
 * @classID 427
 * @assignmentNumber 2
 * 
 * This class acts as a calculator. It is able to do calculations such as
 * add, subtract, multiply and divide. All calculations are computed on the
 * running total which it initialized to zero.
 * 
 * 
 */

package cse360assign2;

public class Calculator {

	private int total;

	public Calculator() {
		total = 0; // not needed - included for clarity
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
	 * 
	 * @param value value which is added to the total
	 */
	public void add(int value) {
		total += value;
	}

	/**
	 * This method subtracts an integer value from the running total
	 * 
	 * @param value value to be subtracted from the total
	 */
	public void subtract(int value) {
		total -= value;
	}

	/**
	 *
	 * This method multiplies an integer value by the running total
	 * 
	 * @param value value which the total is multiplied by
	 */
	public void multiply(int value) {
		total *= value;
	}

	/**
	 * 
	 * This method divides the running total by an integer value If the value passed
	 * in is zero, the total is set to zero, else normal integer division is applied
	 * 
	 * @param value value which the total is divided by
	 */
	public void divide(int value) {
		if (value == 0)
			total = 0;
		else
			total /= value;
	}

	/**
	 * This method will return string of all calculations done on the total
	 * 
	 * @return currently returns empty string TODO have return string of all
	 *         calculations done
	 */
	public String getHistory() {
		return "";
	}
	
}