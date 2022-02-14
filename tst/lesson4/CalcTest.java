package lesson4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		Calc calc = new Calc();
		double expected=4;
		double actual=calc.add(2, 2);
		Assert.assertEquals(expected, actual,0.001);
		
	}

	@Test
	public void testDiv() {
		Calc calc = new Calc();
		double expected=4;
		double actual=calc.div(8, 2);
		Assert.assertEquals(expected, actual,0.001);
	}

	@Test
	public void testAdd1() {
		Calc calc = new Calc();
		double expected=5;
		double actual=calc.add(2, 3);
		Assert.assertEquals(expected, actual,0.001);
		
	}

	@Test
	public void testDiv1() {
		Calc calc = new Calc();
		double expected=3;
		double actual=calc.div(9, 3);
		Assert.assertEquals(expected, actual,0.001);
	}
	
}
