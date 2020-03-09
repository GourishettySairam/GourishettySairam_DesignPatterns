package com.epam.creationalPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tiger implements IAnimal
{
	final Logger LOGGER = LogManager.getLogger(Tiger.class);
	public void speak()
	{
		LOGGER.info("Tiger says : Halum");
	}
	public void action()
	{
		LOGGER.info("Tigers prefer hunting...");
	}
	
}
