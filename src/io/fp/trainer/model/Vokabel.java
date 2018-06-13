package io.fp.trainer.model;

public class Vokabel {
	
	private String german;
	private String english;
	private String test;
	
	public Vokabel(String german, String english) {
		this.german = german;
		this.english = english;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public String getGerman() {
		return german;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Vokabel vokabel = (Vokabel) o;
		if(!german.equals(vokabel.german)) return false;
		return english.equals(vokabel.english);	
	}
	
	@Override
	public int hashCode() {
		int result = german.hashCode();
		return result;
	}

}

