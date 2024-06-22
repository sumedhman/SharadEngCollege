package sam.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Practise2 {
	int x=2;
	int y=2;
	int z=3;
	
	boolean a = (x==y);
	boolean b= (y==z);
		
		// will this test produce a green bar or red bar?
	@Test
	void test() {
		assertNotEquals(a,b);
	}


}
