package StrategyDesign.strategy.drive;

public class NormalMode implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("NormalMode activated");
	}
	
}
