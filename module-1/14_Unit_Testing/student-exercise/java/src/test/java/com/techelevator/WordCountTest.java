package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

	@Test
	public void wordcount_black_sheep() {
		WordCount myTest = new WordCount();
		String[] words = {"ba", "ba", "black", "sheep"};
		String[] ans = {"ba= 2", "black= 1", "sheep=1"};
		Map<String, Integer> count = myTest.getCount(words);
		
		Assert.assertEquals(ans, count);
	}
}
