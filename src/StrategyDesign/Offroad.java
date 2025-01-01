package StrategyDesign;

import StrategyDesign.strategy.drive.SportsMode;

public class Offroad  extends Vehicle{
	
	Offroad(){
		super(new SportsMode());
	}
}

