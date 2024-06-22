package sam.com;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAndAfterAllDemoTest {
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
		
}
