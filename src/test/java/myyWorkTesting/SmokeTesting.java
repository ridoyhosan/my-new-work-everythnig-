package myyWorkTesting;


import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import All.myyWorkTest.AllSelectElements;
import All.myyWorkTest.ToOpenNClose;



public class SmokeTesting {
	
	
	
	
	AllSelectElements allSelectElements= new AllSelectElements();
	
	
	
	 @BeforeTest
	 public void open() throws MalformedURLException {
		 ToOpenNClose.opentDriver("chromedriver");
		 
		 
	 }
	 @Test
	 public void smokeTesingOnHomePage() throws InterruptedException {
		 AllSelectElements.tittleurl();
		 //AllSelectElements.click();
		 AllSelectElements.elementsloop();
	
		 //System.out.println("hi");
		 
		 
	 }
	 @AfterTest
	 public void closeDriver () throws InterruptedException  {
		 
		AllSelectElements.closeTheDriver();
		 
		 
	 }
	

}
