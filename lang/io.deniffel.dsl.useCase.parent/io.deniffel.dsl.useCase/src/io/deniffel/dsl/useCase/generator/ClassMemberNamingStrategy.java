package io.deniffel.dsl.useCase.generator;

public class ClassMemberNamingStrategy extends  ClassNamingStrategy{
	
	@Override
	public String convert(String input) {
		if(input == null)
			return null;
		input = replaceForbiddenCharacters(input);
		input = super.convert(input);
		input = input.substring(0, 1).toLowerCase() + input.substring(1);
		return input;
	}
	
	private String replaceForbiddenCharacters(String input) {
		String res = "";
		for(int i=0; i<input.length(); i++)
			if(includesForbiddenCharacters(input.charAt(i)+"")) 
				res += '_';
			else 
				res += input.charAt(i);
		
		return res;
	}
}
