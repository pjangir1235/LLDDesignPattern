package parkingLot.parkingspot;

public class ParkingSpotDto {
	private FloorDto floorData ;
	private SpotDto spotData;
	public ParkingSpotDto(FloorDto floorData, SpotDto spotData) {
		super();
		this.floorData = floorData;
		this.spotData = spotData;
	}
	public FloorDto getFloorData() {
		return floorData;
	}
	public void setFloorData(FloorDto floorData) {
		this.floorData = floorData;
	}
	public SpotDto getSpotData() {
		return spotData;
	}
	public void setSpotData(SpotDto spotData) {
		this.spotData = spotData;
	}
	
}
