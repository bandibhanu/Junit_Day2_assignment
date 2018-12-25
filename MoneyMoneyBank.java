package com.caogemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyMoneyBank {

	@Test
	public void Test()
	{
		int expected=1067;
	SavingsAccount object=new SavingsAccount("bhanu",1000);
	 int actual=object.deposit(67);
	assertEquals(expected, actual);
	System.out.println(object.getName());
	System.out.println(object.getInitialAmount());
	System.out.println(actual);
	System.out.println(object.getNextAccountNumber());
	}
	
	@Test
	public void Test2()
	{
	SavingsAccount object1=new SavingsAccount("Shabzan",100);
	try 
	{
		int expected=64;
		int actual=object1.withdrew(36);
		assertEquals(expected, actual);
		System.out.println(actual);
		System.out.println(object1.getName());
		System.out.println(object1.getInitialAmount());
		System.out.println(object1.getNextAccountNumber());
	} 
	catch (invalidException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

    
