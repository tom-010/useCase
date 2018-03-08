package io.deniffel.dsl.useCase.generator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassMemberNamingStrategyTest {

	ClassMemberNamingStrategy s = new ClassMemberNamingStrategy();
	
	@BeforeEach
	public void setUp() {
		s = new ClassMemberNamingStrategy();
	}
	
	@Test
	void firstLetterBecomesLowerCase() {
		
		assertEquals("abc", s.convert("Abc"));
	}
	
	@Test
	void memberNameCanContainSpecialChars() {
		String specialChars = "!\"§$%&/()=?';:,.+#¹²³¼½¬{[]}\\-_";
		for(int i=0; i<specialChars.length(); i++) 
			s.convert("before"+specialChars.charAt(i)+"name");
	}

}
