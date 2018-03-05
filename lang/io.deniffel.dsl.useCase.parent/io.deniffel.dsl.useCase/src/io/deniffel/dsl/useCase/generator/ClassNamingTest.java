package io.deniffel.dsl.useCase.generator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassNamingTest {

	public static class ClassNamingStrategy {
		
		String convert(String input) {			
			checkPreCoditions(input);
			
			input = input.trim();
			input = input.substring(0, 1).toUpperCase() + input.substring(1);
			input = camelCaseString(input);
			
			return input; 
		}
		
		private void checkPreCoditions(String input) throws IllegalArgumentException {
			if(input == null || input.trim().isEmpty()) 
				throw new IllegalArgumentException("Can't use empty Classname");
			
			input = input.trim();
			
			if(startsWithNumber(input))
				throw new IllegalArgumentException("Class name can't start with a number");
			
			if(!startsWithLetter(input))
				throw new IllegalArgumentException("Class must start with an letter");
			
			if(!includesForbiddenCharacters(input)) {
				throw new IllegalArgumentException("Classname can only contain numbers, letters, '-' and '_'");
			}
		}
		
		private String camelCaseString(String input) {
			input = input.replaceAll("\\s+", " ");
			
			int pos = splitPosition(input);
			if(pos < 0)
				return input;
			return input.substring(0, pos) + 
					input.substring(pos+1, pos+2).toUpperCase() + 
					input.substring(pos+2);
		}
		
		List<Character> splitChars = " \t".chars().mapToObj(e->(char)e).collect(Collectors.toList());
		
		private int splitPosition(String s) {
			for(int i=0; i<s.length(); i++) 
				if(splitChars.contains(s.charAt(i)))
					return i;
			return -1;
		}
		
		private boolean startsWithNumber(String s) {
			return Character.isDigit(s.charAt(0));
		}
		
		private boolean startsWithLetter(String s) {
			return s.matches("^([A-Z]|[a-z]).*$");
		}
		
		private boolean includesForbiddenCharacters(String s) {
			return s.matches("^[a-zA-Z-_0-9 \t]+$");
		}
	}
	
	ClassNamingStrategy s;
	
	@BeforeEach
	public void setUp() {
		s = new ClassNamingStrategy();
	}
	
	@Test
	void environment() {
		assertFalse(s == null);
	}
	
	@Test
	void null_throws() {
		assertConvertThrows(IllegalArgumentException.class, null);
	}
	
	@Test
	void singleCharacter_returnsTheUppercaseVerionOfTheChar() {
		assertConvert("A", "a");
	}
	
	@Test
	void secondLowercaseCharacterRemainsUntouched() {
		assertConvert("Aa", "aa");
	}
	
	@Test 
	void emptyString_throws() {
		assertConvertThrows(IllegalArgumentException.class, "");
	}
	
	@Test
	void classNameStartingWithNumber_throwsExcpetion() {
		assertConvertThrows(IllegalArgumentException.class, "1name");
	}
	
	@Test
	void classNameStartsWithAnSpecialCharacter_throwsExcpetion() {
		String specialChars = "!\"§$%&/()=?';:_,-.+#¹²³¼½¬{[]}\\234";
		for(int i=0; i<specialChars.length(); i++) 
			assertConvertThrows(IllegalArgumentException.class, specialChars.charAt(i)+"name");
	}
	
	@Test 
	void ignoresStartingBlanks() {
		assertConvert("Abc", " Abc");
		assertConvert("Abc", "  Abc");
		assertConvert("Abc", "   Abc");
	}
	
	@Test
	void ignoresFollowingBlanks() {
		assertConvert("Abc", "Abc ");
		assertConvert("Abc", "Abc  ");
		assertConvert("Abc", "Abc   ");
	}
	
	@Test 
	void classNameIncludesSpecialCharacter_throwsExcpetion() {
		String specialChars = "!\"§$%&/()=?';:,.+#¹²³¼½¬{[]}\\"; // No _ or - or number is included here!
		for(int i=0; i<specialChars.length(); i++) 
			assertConvertThrows(IllegalArgumentException.class, "before"+specialChars.charAt(i)+"name");
	}
	
	@Test
	void canContainDash() {
		assertConvert("A-b", "A-b");
		assertConvert("Ab-", "Ab-");
		assertConvert("A-b--", "A-b--");
	}
	
	@Test
	void canContainUnderscore() {
		assertConvert("A_b", "A_b");
		assertConvert("Ab_", "Ab_");
		assertConvert("A_b__", "A_b__");
	}
	
	@Test
	void canContainNumber() {
		assertConvert("A1b", "A1b");
		assertConvert("Ab1", "Ab1");
		assertConvert("A1b12345", "A1b12345");
	}
	
	@Test
	void aWordCanContainSpaces() {
		String ignored= s.convert("ab cd");
	}
	
	@Test
	void aSpaceInTheWord_camelcaseTheNextChar() {
		assertConvert("AbCd", "ab cd");
	}
	
	@Test
	void chamelCaseDoesNotAffectNumbers() {
		assertConvert("Ab5d", "ab 5d");
	}
	
	@Test
	void chamelCaseDoewNotAffectAllowedSpecialChars() {
		assertConvert("Ab-d", "ab -d");
		assertConvert("Ab_d", "ab _d");
	}
	
	@Test
	void chamelChaseIgnoresDoubleChars() {
		assertConvert("AbCd", "ab  cd");
		assertConvert("AbCd", "ab   cd");
		assertConvert("AbCd", "ab    cd");
	}
	
	@Test
	void chamelCaseOnTab() {
		assertConvert("AbCd", "ab\tcd");
	}
	
	@Test 
	void doubleTab_secondTabIsIgnored() {
		assertConvert("AbCd", "ab\t\tcd");
	}
	
	@Test
	void twoFollowingDifferentSeperators_onlyOneIsApplied() {
		assertConvert("AbCd", "ab\t cd");
	}
	
	void assertConvert(String expected, String given) {
		assertEquals(expected, s.convert(given));
	}
	
	void assertConvertThrows(Class excpetion, String input) {
		assertThrows(excpetion, () -> s.convert(input), input);
	}

}
