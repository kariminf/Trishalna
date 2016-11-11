package kariminf.trishalna;

import kariminf.trishalna.java.JavaSegmenter;
import kariminf.trishalna.tools.Data;

public class Trishalna {

	private Data data1 = new Data();
	private Data data2 = new Data();
	private ProgLang pl;
	
	
	public Trishalna(ProgLang pl){
		
		this.pl = pl;
		
	}
	
	public void clearFirst(){
		data1.clear();
	}
	
	public void clearSecond(){
		data2.clear();
	}
	
	private void preProcess(Data data, String program){
		data.clear();
		PreProcess p = new PreProcess(pl);
		p.preProcess(data, program);
	}
	
	public void setFirstProgram(String program){
		preProcess(data1, program);
	}
	
	public void setSecondProgram(String program){
		preProcess(data2, program);
	}

}
