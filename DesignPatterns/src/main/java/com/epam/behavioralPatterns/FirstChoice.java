package com.epam.behavioralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstChoice implements IChoice
{
	final Logger LOGGER = LogManager.getLogger(FirstChoice.class);
	
	public void MyChoice()
	{
		LOGGER.info("Travelling to Japan");
	}
}
