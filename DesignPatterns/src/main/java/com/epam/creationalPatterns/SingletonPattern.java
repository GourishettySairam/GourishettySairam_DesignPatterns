package com.epam.creationalPatterns;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public final class SingletonPattern 
{
	final static Logger LOGGER = LogManager.getLogger(SingletonPattern.class);
	
	private static SingletonPattern instance = new SingletonPattern();
	private int numberOfInstances = 0;
	private SingletonPattern()
	{
		LOGGER.info("Instantiating inside the private constuctor");
		numberOfInstances++;
		LOGGER.info("number of instances "+ numberOfInstances);
	}
	public static SingletonPattern Instance()
	{
		LOGGER.info("We already have an instance now. Use it");
		return instance;
	}
}
