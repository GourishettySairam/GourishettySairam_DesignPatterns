package com.epam.behavioralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Visitor implements IVisitor
{
	final Logger LOGGER = LogManager.getLogger(Visitor.class);
	
	public void Visit(MyClass myClassElement)
	{
		LOGGER.info("Visitor is trying to change the integer value");
		myClassElement.set(100);
		LOGGER.info("Exiting from visitor");
	}
}
