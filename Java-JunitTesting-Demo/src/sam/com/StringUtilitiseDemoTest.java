package sam.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilitiseDemoTest {

	@Test
	void testIsCapatalized() {
		String s="Apple";
		String t="apple";
		String u ="grape";
		String v=null;
		String w="";
		
		StringUtilitiesDemo stringUtilities =new StringUtilitiesDemo();
		assertTrue(stringUtilities.isCapitalized(s));
		assertFalse(stringUtilities.isCapitalized(t));
		assertFalse(stringUtilities.isCapitalized(u));
		assertFalse(stringUtilities.isCapitalized(v));
		assertFalse(stringUtilities.isCapitalized(w));
				
	}
}

