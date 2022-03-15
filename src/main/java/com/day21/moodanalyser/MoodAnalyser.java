package com.day21.moodanalyser;

/*
 *  UC1-Given a Message, ability to analyse and respond Happy or Sad Mood 
 * -create MoodAnalyser Object - Call analyseMood function with message as
 *  parameter and return Happy or Sad Mood
 */

/**
 * We have created this class to check the mood according to the input string
 * message
 * 
 * @author user -Almas
 *
 */
public class MoodAnalyser {
	private String message;

	/**
	 * create default constructor of MoodAnalyser
	 */
	public MoodAnalyser() {
		this.message = null;
	}

	/**
	 * create parameterized constructor by passing string message
	 * 
	 * @param message
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * creating getter setter method
	 * 
	 * @return -return message
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * this method will compute if the mood is happy or sad. 1. We will convert the
	 * message to lower case and check it the string contains happy or sad word in
	 * it. Accordingly we will return Happy or Sad mood
	 * 
	 * @return -return to the method created
	 */

	public String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

	/**
	 * Main method for manipulation Of MoodAnalyser
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String args[]) {
		System.out.println("Mood Analyser");

		/**
		 * created object of moodAnalyser class
		 */
		MoodAnalyser moodAnalyser = new MoodAnalyser();

		moodAnalyser.setMessage("I am Happy");
		System.out.println(moodAnalyser.analyseMood());

		moodAnalyser.setMessage("I am Sad");
		System.out.println(moodAnalyser.analyseMood());

		moodAnalyser.setMessage(null);
		System.out.println(moodAnalyser.analyseMood());
	}
}
