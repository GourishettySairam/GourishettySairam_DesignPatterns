package com.epam.structuralPatterns;

public class CalculatorAdapter 
{
	public double GetArea(Triangle triangle)
	{
		Calculator c = new Calculator();
		Rectangle rect = new Rectangle();
		rect.length = triangle.baseT;
		rect.width = 0.5*triangle.height;
		return c.GetArea(rect);
	}

}
