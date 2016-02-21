package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator myCalc = new Calculator();
		assertNotNull(myCalc);
	}

	@Test
	public void testGetTotal() {
		Calculator myCalc = new Calculator();
		myCalc.add(3);
		assertEquals(3, myCalc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator myCalc = new Calculator();
		myCalc.add(5);
		assertEquals(5, myCalc.getTotal());
	}
	
	@Test
	public void testNegAdd() {
		Calculator myCalc = new Calculator();
		myCalc.add(-5);
		assertEquals(-5, myCalc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(2);
		assertEquals(-2, myCalc.getTotal());
	}
	
	@Test
	public void testNegSubtract() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(-2);
		assertEquals(2, myCalc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator myCalc = new Calculator();
		myCalc.add(3);
		myCalc.multiply(6);
		assertEquals(18, myCalc.getTotal());
	}
	
	@Test
	public void testNegMultiply() {
		Calculator myCalc = new Calculator();
		myCalc.add(3);
		myCalc.multiply(-6);
		assertEquals(-18, myCalc.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator myCalc = new Calculator();
		myCalc.add(56);
		myCalc.divide(7);
		assertEquals(8, myCalc.getTotal());
	}
	
	@Test
	public void testNegDivide() {
		Calculator myCalc = new Calculator();
		myCalc.add(56);
		myCalc.divide(-7);
		assertEquals(-8, myCalc.getTotal());
	}
	
	@Test
	public void testDivideByZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(56);
		myCalc.divide(0);
		assertEquals(0, myCalc.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.subtract(4);
		assertEquals("", myCalc.getHistory()); // for now history just returns an empty string
	}

}
