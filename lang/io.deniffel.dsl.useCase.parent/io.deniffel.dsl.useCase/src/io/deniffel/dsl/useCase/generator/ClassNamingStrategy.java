package io.deniffel.dsl.useCase.generator;

import java.util.List;
import java.util.stream.Collectors;

public class ClassNamingStrategy {
	
	String convert(String input) {			
		checkPreCoditions(input);
		
		input = trim(input);
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		while(splitPosition(input) > -1)
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
	
	private String trim(String input) {
		
		while(isSpecial(input.charAt(input.length()-1)) && input.length() > 0) {
			input = input.substring(0, input.length()-1);
		}
		
		String res = "";
		boolean lastWasSpecial = false;
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			if(!(isSpecial(c) && lastWasSpecial)) 
				res += c; 
		
			lastWasSpecial = isSpecial(c);
		}
		
		return res;
	}
	
	private boolean isSpecial(char c) {
		return splitChars.contains(c);
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
	
	List<Character> splitChars = " \t-_".chars().mapToObj(e->(char)e).collect(Collectors.toList());
	
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
