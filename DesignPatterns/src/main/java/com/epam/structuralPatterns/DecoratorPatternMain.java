package com.epam.structuralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DecoratorPatternMain {

	public static void main(String[] args) 
	{
		final Logger LOGGER = LogManager.getLogger(DecoratorPatternMain.class);
		LOGGER.info("Decorator Pattern");
		
		ConcreteComponent cc = new ConcreteComponent();
		
		ConcreteDecoratorEx1 decorator1 = new ConcreteDecoratorEx1();
		decorator1.setTheComponent(cc);
		decorator1.MakeHouse();
		
		ConcreteDecoratorEx2 decorator2 = new ConcreteDecoratorEx2();
		decorator2.setTheComponent(decorator1);
		decorator2.MakeHouse();
		
	}

}
