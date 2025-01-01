package parkingLot.vehicle;

public class VehicleDto {
	private String vehicleNo;
	private VehicleType type;
	
	public VehicleDto(String vehicleNo, VehicleType type) {
		super();
		this.vehicleNo = vehicleNo;
		this.type = type;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
}
