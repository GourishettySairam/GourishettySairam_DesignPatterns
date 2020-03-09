package com.epam.creationalPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryPatternMain {

	public static void main(String[] args) 
	{
		final Logger LOGGER = LogManager.getLogger(FactoryPatternMain.class);
		LOGGER.info("factory pattern:");
		IAnimalFactory tigerFactory = new TigerFactory();
		IAnimal aTiger = tigerFactory.CreateAnimal();
		aTiger.speak();
		aTiger.action();
		
		IAnimalFactory dogFactory = new DogFactory();
		IAnimal aDog = dogFactory.CreateAnimal();
		aDog.speak();
		aDog.action();

	}

}
