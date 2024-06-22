package sam.com;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ArraryDemoTest {
	@Test
	void test() {
		
		int[] array1= {1,2,3};
		int[] array2= {1,2,3};
		int[] array3= {1,7,7};
		int[] array4= {1,2,3,4};
		
		assertArrayEquals(array1, array2);//pass same element and same lenght
		//assertArrayEquals(array2, array3);//fail one or more different element
		//assertArrayEquals(array3, array4); // fail different length
	}
	
	

}
