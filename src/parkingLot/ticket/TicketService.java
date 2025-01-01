package parkingLot.ticket;

import parkingLot.parkingspot.ParkingSpotDto;
import parkingLot.vehicle.VehicleDto;

public interface TicketService {
	public TicketDto createTicket(VehicleDto vehicle, ParkingSpotDto parkingSpot);
	
}
