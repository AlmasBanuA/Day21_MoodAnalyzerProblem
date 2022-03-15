package com.day21.moodanalyser;

/**
 * Given “I am in Sad Mood” message Should Return SAD analyseMood method can just return
 * SAD to pass this Test Case (TC)
 * 
 * Given “I am in Any Mood” message Should Return HAPPY
 * 
 * To make the Test case pass analyseMood method need to check for Sad else return HAPPY
 */

/**
 * create a class name as MoodAnalyserTest
 */

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	/**
	 * Identifies a method as a test method.
	 */
	@Test
	/**
	 * created method analyseSadMood() for getting mood as sad
	 */
	public void analyseSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in Sad Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}

	@Test
	/**
	 * created method analyseAnyMood() for getting mood as Happy
	 */
	public void analyseHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in Happy Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", actualResult);
	}
}
