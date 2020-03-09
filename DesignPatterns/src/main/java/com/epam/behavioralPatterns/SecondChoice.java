package com.epam.behavioralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondChoice implements IChoice
{
	final Logger LOGGER = LogManager.getLogger(SecondChoice.class);
	
	public void MyChoice()
	{
		LOGGER.info("Travelling to India");
	}

}
