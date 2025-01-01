package parkingLot.ticket;

import java.time.LocalDateTime;

import parkingLot.parkingspot.ParkingSpotDto;
import parkingLot.vehicle.VehicleDto;

public class TicketServiceImpl implements TicketService {

	@Override
	public TicketDto createTicket(VehicleDto vehicle, ParkingSpotDto parkingSpot) {
		
		if (parkingSpot == null) {
			return null;
		}
		return new TicketDto(LocalDateTime.parse("2024-12-27T00:00:00"), vehicle, parkingSpot);
	}

	

}
