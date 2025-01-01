package AbstractFactory.factory;

import AbstractFactory.Audi;
import AbstractFactory.BMW;
import AbstractFactory.VehiceBrandEnum;
import AbstractFactory.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(VehiceBrandEnum vehicleEnum) {
		
		switch(vehicleEnum){
			case AUDI : return new Audi();
			case BMW : return new BMW();
			default : return null;
			
		}
	}

}
