package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

	@Test
	public void hello_there_returns_ellohere () {
		NonStart testStart = new NonStart();
		String nonstart = testStart.getPartialString("Hello", "There");
		Assert.assertEquals(nonstart, "ellohere");
	}
	
	@Test
	public void java_code_returns_avaode () {
		NonStart testStart = new NonStart();
		String nonstart = testStart.getPartialString("java", "code");
		Assert.assertEquals(nonstart, "avaode");
	}
	
	@Test
	public void shotl_java_returns_hotlava () {
		NonStart testStart = new NonStart();
		String nonstart = testStart.getPartialString("shotl", "java");
		Assert.assertEquals(nonstart, "hotlava");
	}
	
	@Test
	public void hi_bi_returns_ii () {
		NonStart testStart = new NonStart();
		String nonstart = testStart.getPartialString("hi", "bi");
		Assert.assertEquals(nonstart, "ii");
	}
	
	@Test
	public void a_b_returns_ab () {
		NonStart testStart = new NonStart();
		String nonstart = testStart.getPartialString("a", "b");
		Assert.assertEquals(nonstart, "");
	}
	
	@Test
	public void ale_blank_returns_le () {
		NonStart testStart = new NonStart();
		String nonstart = testStart.getPartialString("ale", "");
		Assert.assertEquals(nonstart, "le");
	}
	
	@Test
	public void blank_beef_returns_eef () {
		NonStart testStart = new NonStart();
		String nonstart = testStart.getPartialString("", "beef");
		Assert.assertEquals(nonstart, "eef");
	}
	
}
