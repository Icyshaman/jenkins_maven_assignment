package demo.calculator;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTest extends TestCase {

	public CalculatorTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(CalculatorTest.class);
	}

	public void testApp() {
		assertTrue(true);
	}
	
	public void testAdd() {
		double n1 = 20;
		double n2 = 32.6;
		double expected_result = 52.6;
		Assert.assertEquals(expected_result,Calculator.Add(n1, n2));
	}
	
	public void testSub() {
		double n1 = 198;
		double n2 = 15;
		double expected_result = 183;
		Assert.assertEquals(expected_result,Calculator.Sub(n1, n2));
	}
	
	public void testMul() {
		double n1 = 52;
		double n2 = 8;
		double expected_result = 416;
		Assert.assertEquals(expected_result,Calculator.Mul(n1, n2));
	}
	
	public void testDiv() {
		double n1 = 55;
		double n2 = 2;
		double expected_result = 27.5;
		Assert.assertEquals(expected_result,Calculator.Div(n1, n2));
	}
}
