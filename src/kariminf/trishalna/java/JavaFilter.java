package kariminf.trishalna.java;

import java.util.ArrayList;
import java.util.List;

import kariminf.trishalna.Filter;
import kariminf.trishalna.tools.Data;

public class JavaFilter extends Filter{

	public JavaFilter() {
		super();
		// TODO Auto-generated constructor stub
	}


	private static final String[] keywords = {
		"public", "protected" , "private", "class", "static", "final",
		"int", "float", "double", "String"
	};
	
	private static final String[] lineStart = {
		"import"
	};
	
	private static final String[] inLines = {
		"List", "ArrayList", "Map", "HashMap"
	};
	
	
	public List<String> filterKeywords(List<String> words){
		List<String> filtered = new ArrayList<String>();
		
		for (String word: words){
			filtered.add(word);
		}
		
		return filtered;
		
	}
	
	
	@Override
	public boolean deleteLine(String line) {
		
		for(String sWord: lineStart){
			if (line.startsWith(sWord))
				return true;
		}
		
		for(String sWord: inLines){
			if (line.contains(sWord))
				return true;
		}
		
		return false;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String line = "private List<String>";
		JavaFilter f = new JavaFilter();
		System.out.println(f.deleteLine(line));
	}


}
