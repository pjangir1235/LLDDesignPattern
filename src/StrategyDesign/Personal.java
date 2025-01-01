package StrategyDesign;

import StrategyDesign.strategy.drive.NormalMode;

public class Personal extends Vehicle{
	
	Personal(){
		super(new NormalMode());
	}
}

