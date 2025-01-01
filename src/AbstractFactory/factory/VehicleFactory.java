package AbstractFactory.factory;

import AbstractFactory.VehiceBrandEnum;
import AbstractFactory.Vehicle;

public interface VehicleFactory {

	Vehicle getVehicle(VehiceBrandEnum	 vehicleEnum);
}
