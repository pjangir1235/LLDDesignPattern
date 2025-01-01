package AbstractFactory.factory;

import AbstractFactory.Mahindra;
import AbstractFactory.Tata;
import AbstractFactory.VehiceBrandEnum;
import AbstractFactory.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(VehiceBrandEnum vehicleEnum) {
		
		switch(vehicleEnum){	
			case TATA : return new Tata();
			case MAHINDRA : return new Mahindra();
			default : return null;
			
		}
	}

}
