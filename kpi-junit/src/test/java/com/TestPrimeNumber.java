package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPrimeNumber {
	PrimeNumber x;
	
	@Before
	public void setUp() throws Exception
	{
     x = new PrimeNumber();
   }
	
   @After
   public void teamDown() throws Exception
   {
	   x = null;
   }
   
   @Test
   public void test()
   {
	   assertTrue("Result",x.prime(5));
	   assertEquals(false,x.prime(9));
	   }
}
   