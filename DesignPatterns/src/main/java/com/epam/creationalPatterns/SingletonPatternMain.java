package com.epam.creationalPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingletonPatternMain 
{
	public static void main(String args[])
	{
		final Logger LOGGER = LogManager.getLogger(SingletonPatternMain.class);
		LOGGER.info("Singleton Pattern Demo");
		LOGGER.info("Trying to create instance s1");
		SingletonPattern s1 = SingletonPattern.Instance();
		LOGGER.info("Trying to create instance s2");
		SingletonPattern s2 = SingletonPattern.Instance();
		if(s1==s2)
		{
			LOGGER.info("only one instance exists");
		}
		else
		{
			LOGGER.info("Different instances exist.");
		}
	}

}
