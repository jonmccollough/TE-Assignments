package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class CigarPartyTest {

	@Test
	public void test_cigar_party_less_than_40_not_weekend() {
		
		CigarParty myTestParty = new CigarParty();
		
		boolean lessThan40notWeekend = myTestParty.haveParty(30, false);
		
		Assert.assertFalse(lessThan40notWeekend);
	}
	
	@Test
	public void test_cigar_party_more_than_40_not_weekend() {
		
		CigarParty myTestParty = new CigarParty();
		
		boolean moreThan40notWeekend = myTestParty.haveParty(40, false);
		
		Assert.assertTrue(moreThan40notWeekend);
	}
	
	@Test
	public void test_cigar_party_more_than_40_is_weekend() {
		
		CigarParty myTestParty = new CigarParty();
		
		boolean moreThan40IsWeekend = myTestParty.haveParty(70, true);
		
		Assert.assertTrue(moreThan40IsWeekend);
	}
	
	@Test
	public void test_cigar_party_less_than_40_is_weekend() {
		
		CigarParty myTestParty = new CigarParty();
		
		boolean moreThan40IsWeekend = myTestParty.haveParty(30, false);
		
		Assert.assertFalse(moreThan40IsWeekend);
	}
	
	@Test
	public void test_cigar_party_more_than_60_is_weekend() {
		
		CigarParty myTestParty = new CigarParty();
		
		boolean moreThan40IsWeekend = myTestParty.haveParty(70, true);
		
		Assert.assertTrue(moreThan40IsWeekend);
	}
	
	@Test
	public void test_cigar_party_more_than_60_not_weekend() {
		
		CigarParty myTestParty = new CigarParty();
		
		boolean moreThan40IsWeekend = myTestParty.haveParty(70, false);
		
		Assert.assertFalse(moreThan40IsWeekend);
	}
}
