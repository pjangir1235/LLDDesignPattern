package StrategyDesign.strategy.drive;

public class SportsMode implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("SportsMode activated");
	}
	
}
