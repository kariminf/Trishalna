package kariminf.trishalna;


import java.util.List;

import kariminf.trishalna.java.JavaFilter;
import kariminf.trishalna.java.JavaSegmenter;
import kariminf.trishalna.tools.Data;

public class PreProcess {
	
	private Segmenter segmenter;
	
	private Filter filter;
	
	
	public PreProcess(ProgLang pl){
		switch (pl){
		case JAVA: 
			segmenter = new JavaSegmenter();
			filter = new JavaFilter();
		}
	}
	
	
	public void preProcess (Data data, String program){
		
		for (String line: segmenter.getLines(program)){
			List<String> words = segmenter.getWords(line);
			
		}
		
	}

}
