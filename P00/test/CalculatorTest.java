import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	int a = 4321;
	int b = 1234;

	Calculator cal = new Calculator();

	@After
	public void tearDown() throws Exception {
	}
	

	@Test
	public void testAdd() {

		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals(expected, actual);
	}

	public void testSub() {

		int actual = cal.sub(a, b);
		int expected = 3087;
		assertEquals(expected, actual);

	}

	public void testMultiply() {

		int actual = cal.multiply(a, b);
		int expected = 5332114;
		assertEquals(expected, actual);
	}

	public void testDivide() {

		int actual = cal.divide(a, b);
		int expected = 3;
		assertEquals(expected, actual);
	}

}
