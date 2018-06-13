package io.fp.trainer.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VokabelTrainer {
	
	
	private Map<String, String> words = new HashMap<>();
	private List<Vokabel> vokabelSammlung = new ArrayList<>();
	
	public void addWord(Vokabel vokabel) {
		vokabelSammlung.add(vokabel);
		
	}
	
	public boolean checkTranslation(String german) {
		
		
		return false;
		
	}
	
	
	public boolean checkTralation(String german) {
		if(words.get(german).equals(...)) {
			return true;
			}
		else {
			return false;
		}
		
	}
	
	
	public void clear() {
		words.clear();
	}
	
	public String toString() {
		return words.toString();
	}

}
