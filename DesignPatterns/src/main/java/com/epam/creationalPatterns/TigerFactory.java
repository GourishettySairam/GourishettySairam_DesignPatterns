package com.epam.creationalPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TigerFactory extends IAnimalFactory
{
	final Logger LOGGER = LogManager.getLogger(TigerFactory.class);
	
	public IAnimal CreateAnimal()
	{
		return new Tiger();
	}
}
