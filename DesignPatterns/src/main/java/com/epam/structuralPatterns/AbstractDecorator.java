package com.epam.structuralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractDecorator extends Component
{
	final Logger LOGGER = LogManager.getLogger(AbstractDecorator.class);
	protected Component com;
	public void setTheComponent(Component c)
	{
		com = c;
	}
	public void MakeHouse()
	{
		if(com!=null)
		{
			com.MakeHouse();
		}
	}
}
