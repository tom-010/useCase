package io.deniffel.dsl.useCase.generator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassNamingTest {

	
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
		s.convert("A-b");
		s.convert("Ab-");
		s.convert("A-b--");
	}
	
	@Test
	void canContainUnderscore() {
		s.convert("A_b");
		s.convert("Ab_");
		s.convert("A_b__");
	}
	
	@Test
	void canContainNumber() {
		assertConvert("A1b", "A1b");
		assertConvert("Ab1", "Ab1");
		assertConvert("A1b12345", "A1b12345");
	}
	
	@Test
	void aWordCanContainSpaces() {
		s.convert("ab cd");
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
		assertConvert("AbD", "ab -d");
		assertConvert("AbD", "ab _d");
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
	
	@Test
	void seperatesOnDash() {
		assertConvert("AbCd", "ab-cd");
	}
	
	@Test
	void multipleFollowingDashesGiven_onlyOneIsUsed() {
		assertConvert("AbCd", "ab--cd");
		assertConvert("AbCd", "ab---cd");
		assertConvert("AbCd", "ab----cd");
	}
	
	@Test
	void seperatesOnUnderscore() {
		assertConvert("AbCd", "ab_cd");
	}
	
	@Test
	void multipleFollowingUnderscoresGiven_onlyOneIsUsed() {
		assertConvert("AbCd", "ab__cd");
		assertConvert("AbCd", "ab___cd");
		assertConvert("AbCd", "ab____cd");
	}
	
	@Test
	void multipleSepteratorsInInput_camelCaseOnEach() {
		assertConvert("AbCdEf", "ab cd ef");
		assertConvert("AbCdEfGh", "ab-cd-ef-gh");
		assertConvert("AbCdEfGhIj", "ab_cd_ef_gh_ij");
		assertConvert("AbCdEf", "ab\tcd\tef");
	}
	
	@Test
	void differentSeperatorsWorkTogether() {
		assertConvert("AbCdEf", "ab cd_ef");
		assertConvert("AbCdEf", "ab cd-ef");
		assertConvert("AbCdEf", "ab cd\tef");
		assertConvert("AbCdEf", "ab_cd ef");
		assertConvert("AbCdEf", "ab_cd-ef");
		assertConvert("AbCdEf", "ab_cd\tef");
		assertConvert("AbCdEf", "ab-cd_ef");
		assertConvert("AbCdEf", "ab-cd ef");
		assertConvert("AbCdEf", "ab-cd\tef");
		assertConvert("AbCdEf", "ab\tcd_ef");
		assertConvert("AbCdEf", "ab\tcd-ef");
		assertConvert("AbCdEf", "ab\tcd ef");
	}
	
	@Test
	void integration() {
		assertConvert("AbCdEf", "  ab cd_ef----");
		assertConvert("AbCdEf", "  Ab cd_ef----");
		assertConvert("AbCdEf", "ab \t\t -__---- cd_   ef----");
		assertConvert("ThisIsAnTestLikeYouSeeIt", "This is an Test like you See-It");
	}
	
	void assertConvert(String expected, String given) {
		assertEquals(expected, s.convert(given));
	}
	
	@SuppressWarnings("unchecked")
	void assertConvertThrows(@SuppressWarnings("rawtypes") Class excpetion, String input) {
		assertThrows(excpetion, () -> s.convert(input), input);
	}

}
