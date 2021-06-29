package com.mscprojplac;

//package testpkg;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mscprojplac.Calculator;

/**
 * @author Sharon
 *
 */
public class AppTest {

	Calculator Calculation;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		Calculation = new Calculator(50,10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link calculatorpkg.Calculator#getValue1()}.
	 */
	@Test
	public void testGetValue1() {
		int num = Calculation.getValue1();
		assertEquals(num,50);		
	}

	/**
	 * Test method for {@link calculatorpkg.Calculator#setValue1(double)}.
	 */
	@Test
	public void testSetValue1() {
		Calculation.setValue1(20);
		int num = Calculation.getValue1();
		assertEquals(num,20);
	}

	/**
	 * Test method for {@link calculatorpkg.Calculator#getValue2()}.
	 */
	@Test
	public void testGetValue2() {
		int num = Calculation.getValue2();
		assertEquals(num,10);
	}

	/**
	 * Test method for {@link calculatorpkg.Calculator#setValue2(double)}.
	 */
	@Test
	public void testSetValue2() {
		Calculation.setValue1(10);
		int num = Calculation.getValue1();
		assertEquals(num,10);
	}

}
