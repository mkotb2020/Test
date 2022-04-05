import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator testObj = new Calculator();

	@Test
	void test() {
		// fail("Not yet implemented");
		assertEquals(3, testObj.add(1, 2));
		assertEquals(3, testObj.subtract(5, 2));
		assertEquals(3, testObj.divide(6, 2));
		assertEquals(0, testObj.divide(6, 0));
	}

}
