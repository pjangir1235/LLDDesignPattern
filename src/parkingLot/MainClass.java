package parkingLot;

import java.util.ArrayList;
import java.util.List;

import parkingLot.parkingspot.FloorDto;
import parkingLot.parkingspot.ParkingSpotDto;
import parkingLot.parkingspot.ParkingSpotService;
import parkingLot.parkingspot.ParkingSpotServiceImpl;
import parkingLot.parkingspot.SpotDataDto;
import parkingLot.parkingspot.SpotDto;
import parkingLot.payment.PaymentFactory;
import parkingLot.payment.PaymentInterface;
import parkingLot.ticket.TicketDto;
import parkingLot.ticket.TicketService;
import parkingLot.ticket.TicketServiceImpl;
import parkingLot.vehicle.FourWheelerVehicle;
import parkingLot.vehicle.TwoWheelerVehicle;
import parkingLot.vehicle.VehicleDto;

public class MainClass {
	public static void main(String[] args) {
		TicketService tService=new TicketServiceImpl();
		ParkingSpotService parkingService = new ParkingSpotServiceImpl();
		SpotDto spot1=new SpotDto("1", new TwoWheelerVehicle());
		SpotDto spot2=new SpotDto("2", new TwoWheelerVehicle());
		SpotDto spot3=new SpotDto("3", new FourWheelerVehicle());
		SpotDto spot4=new SpotDto("4",new FourWheelerVehicle());
		List<SpotDto> spotData = new ArrayList<SpotDto>();
		spotData.add(spot4);
		spotData.add(spot3);
		spotData.add(spot2);
		spotData.add(spot1);
		SpotDataDto spotDataDto = new SpotDataDto(spotData);
		FloorDto floorDto =new FloorDto("G");
		parkingService.addFloor(floorDto, spotDataDto);
		PaymentInterface paymentService = null;
		
		
		
		//RegularActivity
		VehicleDto v1=new VehicleDto("KA01JL1234", new TwoWheelerVehicle());
		ParkingSpotDto parkingSpot= parkingService.getParkingSpot(v1.getType());
		TicketDto t1 = tService.createTicket(v1, parkingSpot);
			
		if(t1!=null) {
			System.out.println("Ticket Created : " + t1.getParking().getFloorData().getFloorNo()+t1.getParking().getSpotData().getSpotNo());
			paymentService = new PaymentFactory().getPayment("CASH");
			paymentService.doPayment();
		}
		else {
			System.out.println("Parking spot not available");
		}
		
		
		v1=new VehicleDto("KA01JL1235", new TwoWheelerVehicle());
		parkingSpot= parkingService.getParkingSpot(v1.getType());
		t1 = tService.createTicket(v1, parkingSpot);
		if(t1!=null) {
			System.out.println("Ticket Created : " + t1.getParking().getFloorData().getFloorNo()+t1.getParking().getSpotData().getSpotNo());
			paymentService = new PaymentFactory().getPayment("UPI");
			paymentService.doPayment();
		}
		else {
			System.out.println("Parking spot not available");
		}
		
		v1=new VehicleDto("KA01JL1234", new TwoWheelerVehicle());
		parkingSpot= parkingService.getParkingSpot(v1.getType());
		t1 = tService.createTicket(v1, parkingSpot);
		if(t1!=null) {
			System.out.println("Ticket Created : " + t1.getParking().getFloorData().getFloorNo()+t1.getParking().getSpotData().getSpotNo());
			paymentService = new PaymentFactory().getPayment("UPI");
			paymentService.doPayment();
		}
		else {
			System.out.println("Parking spot not available");
		}
		
		
		v1=new VehicleDto("KA02JL1234", new FourWheelerVehicle());
		parkingSpot= parkingService.getParkingSpot(v1.getType());
		t1 = tService.createTicket(v1, parkingSpot);
		if(t1!=null) {
			System.out.println("Ticket Created : " + t1.getParking().getFloorData().getFloorNo()+t1.getParking().getSpotData().getSpotNo());
			paymentService = new PaymentFactory().getPayment("CASH");
			paymentService.doPayment();
		}
		else {
			System.out.println("Parking spot not available");
		}
		
		
		
		
		
	}

}
