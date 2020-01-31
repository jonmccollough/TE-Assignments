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
	//	String[] ans = {"ba= 2", "black= 1", "sheep=1"};
		Map<String,Integer> ans  = new HashMap<String, Integer>() 
		{{ 
			put("ba" , 2); 
			put("black", 1);
			put("sheep", 1);
		}};
		Map<String, Integer> count = myTest.getCount(words);
		
		Assert.assertEquals( ans, count);
	}
	
	@Test
	public void wordcount_abc() {
		WordCount myTest = new WordCount();
		String[] words = {"a", "b", "a", "c", "b"};
		Map<String,Integer> ans  = new HashMap<String, Integer>() 
		{{ 
			put("b" , 2); 
			put("c", 1);
			put("a", 2);
		} };
		Map<String, Integer> count = myTest.getCount(words);
		
		Assert.assertEquals( ans, count);
	}
	
	@Test
	public void wordcount_null() {
		WordCount myTest = new WordCount();
		Map<String,Integer> ans  = new HashMap<String, Integer>() 
		{{ 
		}};
		Map<String, Integer> count = myTest.getCount(null);
		
		Assert.assertEquals( ans, count);
	}
}
