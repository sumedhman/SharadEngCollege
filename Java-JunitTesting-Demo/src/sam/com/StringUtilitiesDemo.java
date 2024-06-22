package sam.com;

import java.util.HashSet;

public class StringUtilitiesDemo {
	HashSet <Character> lowerCaseVowels = new HashSet<>();
	HashSet <Character> upperCaseVowels = new HashSet<>();
	
	public StringUtilitiesDemo() {
		lowerCaseVowels.add('a');
		lowerCaseVowels.add('e');
		lowerCaseVowels.add('i');
		lowerCaseVowels.add('o');
		lowerCaseVowels.add('u');
		upperCaseVowels.add('A');
		upperCaseVowels.add('E');
		upperCaseVowels.add('I');
		upperCaseVowels.add('O');
		upperCaseVowels.add('U');
		
	}
	public int vowelCount(String s) {
		int count=0;
		if(s==null) { return 0;}
		for(int i=0; i<s.length();i++) {
			if(lowerCaseVowels.contains(s.charAt(i))) {
				count++;
			}else if(upperCaseVowels.contains(s.charAt(i))) {
				count++;
			}
		}
		return count;
 	}
	
	public boolean isCapitalized(String s) {
	    if(s==null || s.length()==0) {return false;}
	    else {
		return (upperCaseVowels.contains(s.charAt(0)));	
	    }
	    }
}