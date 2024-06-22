package sam.com;



import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

class DataTest {
	static ArrayList<Integer> numberList;
	static URL path;
	static File file;
	static Scanner scanner;	

	@BeforeAll  //read the text file in to the array list
	public static void init() throws FileNotFoundException{
		numberList =new ArrayList<Integer>();
		path= DataTest.class.getResource("number.txt"); //10,20,30,40
		file= new File(path.getFile());
		scanner =new Scanner(file);
		while(scanner.hasNext()) {
			Integer i= Integer.parseInt(scanner.next());
			numberList.add(i);
		}
	}
	@Test
	public void testFindLargest() {
		int computedValue=Data.findLargest(numberList);
		int expectedValue=40;
		assertEquals(expectedValue,computedValue);
	}	
	@AfterAll
	public static void tearDown() {
		scanner.close();
	}
}
