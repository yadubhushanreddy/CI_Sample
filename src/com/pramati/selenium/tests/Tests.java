package com.pramati.selenium.tests;

import org.testng.annotations.Test;

import com.pramati.selenium.reusables.ReusableMethods;

public class Tests 
{
	
  ReusableMethods reuse = new ReusableMethods();
  
  @Test
  public void testCase1() throws InterruptedException 
  {
	  reuse.openBrowser("Chrome");
	  reuse.waitFor(4);
	  reuse.closeBrowser();	  
  }
}
