package parkingLot.parkingspot;

import parkingLot.ticket.TicketDto;
import parkingLot.vehicle.VehicleType;

public interface ParkingSpotService {
	public ParkingSpotDto getParkingSpot(VehicleType type);
	public void releaseParkingSpot(TicketDto ticket);
	void addFloor(FloorDto floor, SpotDataDto spotData);
	
}
