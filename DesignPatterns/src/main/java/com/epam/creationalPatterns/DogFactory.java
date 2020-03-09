package com.epam.creationalPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DogFactory extends IAnimalFactory
{
	final Logger LOGGER = LogManager.getLogger(DogFactory.class);
	public IAnimal CreateAnimal()
	{
		return new Dog();
	}
	
}
