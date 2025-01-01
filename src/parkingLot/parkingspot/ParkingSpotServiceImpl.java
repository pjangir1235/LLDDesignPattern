package parkingLot.parkingspot;

import java.util.LinkedHashMap;
import java.util.Map;

import parkingLot.ticket.TicketDto;
import parkingLot.vehicle.VehicleType;

public class ParkingSpotServiceImpl implements ParkingSpotService {
	Map<FloorDto, SpotDataDto> spotMap = new LinkedHashMap<>();
	
	@Override
	public void addFloor(FloorDto floor, SpotDataDto spotData) {
		spotMap.put(floor, spotData);
	}

	@Override
	public ParkingSpotDto getParkingSpot(VehicleType type) {
		for(FloorDto floor: spotMap.keySet()) {
			SpotDataDto spotData = spotMap.get(floor);
			for(SpotDto spot :spotData.getVacateSpot()) {
				if(spot.getType().getType()==type.getType()) {
					spotData.getOccupiedSpot().add(spot);
					spotData.getVacateSpot().remove(spot);
					return new ParkingSpotDto(floor, spot);
				}
			}
		}
		return null;
	}

	@Override
	public void releaseParkingSpot(TicketDto ticket) {
		SpotDataDto spotData = spotMap.get(ticket.getParking().getFloorData());
		spotData.getOccupiedSpot().remove(ticket.getParking().getSpotData());
		spotData.getVacateSpot().add(ticket.getParking().getSpotData());
		
	}

}
