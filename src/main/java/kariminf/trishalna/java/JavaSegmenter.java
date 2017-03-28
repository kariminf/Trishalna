package kariminf.trishalna.java;

import java.util.ArrayList;
import java.util.List;

import kariminf.trishalna.Segmenter;

public class JavaSegmenter extends Segmenter{

	
	public JavaSegmenter() {
		super();
	}

	
	@Override
	public List<String> getLines(String program) {
		ArrayList<String> result = new ArrayList<String>();
		
		//delete brackets
		program = program.replaceAll("[\\{\\};]", "\n");
		
		for (String line: program.split("\n")){
			line = line.trim();
			if (line.length() < 3) //at leat 3 characters like i++
				result.add(line);
		}
		
		return result;
	}

	
	@Override
	public List<String> getWords(String line) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
