package com.shri.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.shri.Calculator;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();

	@Test
	public void addTest() {
		int res = calculator.add(5, 7);
		assertEquals(12, res);
	}

	@Test
	public void subTest() {
		int res = calculator.sub(5, 7);
		assertEquals(-2, res);
	}
	
	@Test
	public void mulTest() {
		int res = calculator.mul(5, 7);
		assertEquals(35, res);
	}
	
	@Test
	public void divTest() {
		int res = calculator.div(5, 7);
		assertEquals(0, res);
	}
	
	@Test
	public void lengthTest() {
		int res = calculator.length("Shri");
		assertEquals(4, res);
	}
	
	@Test
	public void armstrongTest() {
		boolean res = calculator.isNumberArmstrong(153);
		assertEquals(true, res);
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@After
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void beforeEverything() {
		System.out.println("Before Everything");
	}
	
	@AfterClass
	public static void afterEverything() {
		System.out.println("After Everything");
	}
}
