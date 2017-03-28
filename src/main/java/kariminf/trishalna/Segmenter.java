package kariminf.trishalna;

import java.util.List;

public abstract class Segmenter {
	
	public abstract List<String> getLines(String program);
	
	public abstract List<String> getWords(String line);

}
