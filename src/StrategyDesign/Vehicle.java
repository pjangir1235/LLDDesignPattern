package StrategyDesign;

import StrategyDesign.strategy.drive.DriveStrategy;

public class Vehicle {
	DriveStrategy driveStrategy;
	
	Vehicle(DriveStrategy driveStrategy){
		this.driveStrategy = driveStrategy;
	}
}
