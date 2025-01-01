package parkingLot.parkingspot;

import parkingLot.vehicle.VehicleType;

public class SpotDto {
	private String SpotNo;
	private VehicleType type;
	
	public SpotDto(String spotNo, VehicleType type) {
		super();
		SpotNo = spotNo;
		this.type = type;
	}
	public String getSpotNo() {
		return SpotNo;
	}
	public void setSpotNo(String spotNo) {
		SpotNo = spotNo;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
}
