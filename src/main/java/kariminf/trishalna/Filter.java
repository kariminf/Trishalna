package kariminf.trishalna;

import java.util.List;

import kariminf.trishalna.tools.Data;

public abstract class Filter {
	
	public abstract List<String> filterKeywords(List<String> words);
	
	public abstract boolean deleteLine (String line);
	

}
