package sam.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class Practice1 {
	int x=2;
	int y=1;
	int z=3;
	//write  a test method with an assert that show, x and y are equal to each other	
	//write  a test method with an assert that show, y and z are not equal to each other
	@Test
	void test1() {
		assertEquals(x,y);
	}
	@Test
	void test2() {
		assertNotEquals(y, z);
	}
}
