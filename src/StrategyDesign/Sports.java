package StrategyDesign;

import StrategyDesign.strategy.drive.SportsMode;

public class Sports  extends Vehicle{
	
	Sports(){
		super(new SportsMode());
	}
}
