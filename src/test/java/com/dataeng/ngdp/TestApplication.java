package com.dataeng.ngdp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestApplication {

	String message = "ctm";
	
	Application messageObj = new Application(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage");
		assertEquals(message, messageObj.printMessage());
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage");
		message = "Hi!" + "ctm";
		assertEquals(message, messageObj.salutationMessage());
	}
	
}