package com.bptn.course.week4.friday_challange;

public class HiddenWord {

	/** Declare any fields (instance variables) **/
	String hiddenWord;

	/** Declare a constructor */
	public HiddenWord(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}

	/** Write the getHint method */
	String getHint(String hint) {
		String generateHint = "";
		for (int i = 0; i < hint.length(); i++) {
			if (hiddenWord.charAt(i) == hint.charAt(i)) {
				generateHint += hint.charAt(i);
			} else if (hiddenWord.contains(Character.toString(hint.charAt(i)))) {
				generateHint += "+";
			} else {
				generateHint += "*";
			}
		}
		return generateHint;
	}

	/** This is a main method for testing the class */
	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
		System.out.println(puzzle.getHint("HELLO") + " it should print H****");
		System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
		System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
		System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

	} // end of main

} // end of class
