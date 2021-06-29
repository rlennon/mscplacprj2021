/**
 *	Calculator Package 
 */
package com.mscprojplac;
//package calculatorpkg;

/**
 * @author Sharon
 * 
 * @version 0.1
 * 
 * Basic calculator class
 *
 */
public class Calculator {
	
	private int value1;
	private int value2;
	
	/**
	 * @param value1 holds the first number in the calculation
	 * @param value2 holds the second number in the calculation
	 */
	public Calculator(int value1, int value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	/**
	 * @return the value1
	 */
	public int getValue1() {
		return value1;
	}
	/**
	 * @param value1 the value1 to set
	 */
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	/**
	 * @return the value2
	 */
	public int getValue2() {
		return value2;
	}
	/**
	 * @param value2 the value2 to set
	 */
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	public int addition() {
		
		return value1 + value2;		
	}
}
