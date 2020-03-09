package com.epam.behavioralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass implements IOriginalInterface
{
	final Logger LOGGER = LogManager.getLogger(MyClass.class);
	
	private int myInt = 5;
	public int get()
	{
		return myInt;
	}
	public void set(int value)
	{
		myInt=value;
	}
	public void Accept(IVisitor visitor)
	{
		LOGGER.info("Initial value of integer is " + myInt);
		visitor.Visit(this);
		LOGGER.info("value of integer now is " + myInt);
	}
}
