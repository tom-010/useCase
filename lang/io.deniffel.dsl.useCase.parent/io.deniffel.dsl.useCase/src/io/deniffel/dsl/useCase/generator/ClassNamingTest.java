package io.deniffel.dsl.useCase.generator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassNamingTest {

	public static class ClassNamingStrategy {
		
		String convert(String input) {
			return "";
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
	void null_returnsEmptyString() {
		assertFalse(s == null);
		assertEquals("", s.convert(null));
	}

}
