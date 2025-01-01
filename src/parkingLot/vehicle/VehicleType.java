package parkingLot.vehicle;

import parkingLot.enumParking.VehicleTypeEnum;

public class VehicleType {
	private VehicleTypeEnum type;
	
	public VehicleType(VehicleTypeEnum type) {
		super();
		this.setType(type);
	}

	public VehicleTypeEnum getType() {
		return type;
	}

	public void setType(VehicleTypeEnum type) {
		this.type = type;
	}
}
