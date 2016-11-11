/*
 * This file is part of AllSummarizer project
 * 
 * Copyright 2015 Abdelkrime Aries <kariminfo0@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kariminf.trishalna.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Data container.
 * 
 * It is used to store data from preprocessing and clustering tasks.
 * 
 * @author Abdelkrime Aries
 * 
 */
public class Data {

	private HashMap<Integer, List<String>> linesTokens = 
			new HashMap<Integer, List<String>>();
	

	/**
	 * Creates a new data container
	 */
	public Data() {

	}
	
	public void clear(){
		linesTokens.clear();
	}

	public void addLineTokens(int lineNbr, List<String> tokens) {
		this.linesTokens.put(lineNbr, tokens);
	}

}
