package sam.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)  // no need to write public static in @Before and @AfterAll method.we just write void method
class BeforeAndAfterAllDemoTest2 {
     MathFunctions mathFunctions; 
	@BeforeAll
	public static void setup() {
		System.out.println("firs");
	}
	@AfterAll
	public static void tearDown() {
		System.out.println("last");
	}
	@Test
	public void test1() {
		System.out.println("now running test 1");
	}
	@Test
	public void test2() {
		System.out.println("now running test 2");
	}
	@Test
	void testDivide() {
		int expected =0;
		int actual = mathFunctions.divide(5, 25);
		assertEquals(expected, actual);
	}
/*
	@Test
	void testMultiple() {
		int expected =300;
		int actual = Math.multiplyExact(expected, arg1)
	}*/
	/*@Test
	void testDivide() {
		assertAll(
				()->assertEquals(0,mathFunction.divide(10,30)),
				()->assertEquals(5,mathFunction.divide(5,25))
				)
	}*/
}
