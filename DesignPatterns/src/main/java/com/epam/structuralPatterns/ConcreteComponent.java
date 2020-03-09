package com.epam.structuralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConcreteComponent extends Component
{
	final Logger LOGGER = LogManager.getLogger(ConcreteComponent.class);
	
	public void MakeHouse()
	{
		LOGGER.info("Original House is complete. It is closed for modification");
	}
}
