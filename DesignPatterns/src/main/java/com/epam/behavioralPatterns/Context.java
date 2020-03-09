package com.epam.behavioralPatterns;

public class Context 
{
	
	IChoice choice;
	public void SetChoice(IChoice choice)
	{
		this.choice = choice;
	}
	public void ShowChoice(FirstChoice f)
	{
		f.MyChoice();
	}
	
}
