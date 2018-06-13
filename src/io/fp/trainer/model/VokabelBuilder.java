package io.fp.trainer.model;

public class VokabelBuilder {
	
	private String germanWord;
	private String englishWord;
	
	public VokabelBuilder() {
	}
	
	public VokabelBuilder withGermanWord(String germanWord) {
		this.germanWord = germanWord;
		return this;
	}
	
	public VokabelBuilder withEnglishWord(String englishWord) {
		this.englishWord = englishWord;
		return this;
	}
	
	public Vokabel build() {
		if(germanWord == null) {
			throw new RuntimeException("Deutsche Wort kann nicht null sein");
		}
		if(englishWord == null) {
			throw new RuntimeException("Englische Wort kann nicht null sein");
		}
		return new Vokabel(germanWord, englishWord);
	}
	
	

}
