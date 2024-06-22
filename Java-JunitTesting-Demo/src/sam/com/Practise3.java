package sam.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Practise3 {
	int x=2;
	int y=2;
	int z=3;
	//write  a test method with an assert that show, a is true
	//write  a test method with an assert that show,b is false
	boolean a = (x==y);
	boolean b= (y==z);
		
	@Test
	void test1() {
		assertTrue(a);
	}
	
	@Test
	void test2() {
		assertFalse(b);
	}

	// will this test produce a green bar or red bar?
	@Test
	void test3() {
		assertTrue(b);
	}


}
