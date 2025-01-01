package parkingLot.ticket;

import java.time.LocalDateTime;

import parkingLot.parkingspot.ParkingSpotDto;
import parkingLot.vehicle.VehicleDto;

public class TicketDto {
	private LocalDateTime timeStamp;
	private VehicleDto vehicle;
	private ParkingSpotDto parking;

	public TicketDto(VehicleDto vehicle, ParkingSpotDto parking) {
		super();
		this.timeStamp = LocalDateTime.now();
		this.vehicle = vehicle;
		this.parking = parking;
	}

	public TicketDto(LocalDateTime timeStamp, VehicleDto vehicle, ParkingSpotDto parking) {
		super();
		this.timeStamp = timeStamp;
		this.vehicle = vehicle;
		this.parking = parking;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public VehicleDto getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDto vehicle) {
		this.vehicle = vehicle;
	}

	public ParkingSpotDto getParking() {
		return parking;
	}

	public void setParking(ParkingSpotDto parking) {
		this.parking = parking;
	}

}
