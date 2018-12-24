package br.com.spring.commons.words.domain;

import java.io.Serializable;

public class Word implements Serializable {
	
	private static final long serialVersionUID = -4625155943946759415L;

	public Word() {}
	
	public Word(String word) {
		this.word = word;
	}
	
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
