package com.epam.creationalPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog implements IAnimal
{
	final Logger LOGGER = LogManager.getLogger(Dog.class);
	
	public void speak()
	{
		LOGGER.info("dog says : BOW BOW");
	}
	public void action()
	{
		LOGGER.info("Dogs prefer barking ...");
	}
}
