package com.epam.behavioralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner; 

public class StrategyPatternMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(StrategyPatternMain.class);
		LOGGER.info("strategy pattern");
		IChoice ic ;
		Context cxt = new Context();
		
		FirstChoice f = new FirstChoice();
		ic=new FirstChoice();
		cxt.SetChoice(ic);
		f.MyChoice();
		
		SecondChoice ch = new SecondChoice();
		ic=new SecondChoice();
		cxt.SetChoice(ic);
		ch.MyChoice();
		
			
		
		sc.close();
	}

}
