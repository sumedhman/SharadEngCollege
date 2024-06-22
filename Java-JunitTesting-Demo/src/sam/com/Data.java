package sam.com;

import java.util.ArrayList;

public class Data {
	public static int findLargest(ArrayList<Integer> num) {
		 int largest=num.get(0);
		 for(int temp:num) {
			 if(temp>largest) {
				 largest=temp;
			 }
		 }
		return 0;
	}
}
