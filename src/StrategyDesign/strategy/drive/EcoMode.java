package StrategyDesign.strategy.drive;

public class EcoMode implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("EcoMode activated");
	}
	
}
