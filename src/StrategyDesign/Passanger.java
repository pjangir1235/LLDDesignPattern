package StrategyDesign;

import StrategyDesign.strategy.drive.EcoMode;

public class Passanger  extends Vehicle{
	
	Passanger(){
		super(new EcoMode());
	}
}

