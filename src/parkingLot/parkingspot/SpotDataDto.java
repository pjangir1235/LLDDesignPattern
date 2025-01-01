package parkingLot.parkingspot;

import java.util.ArrayList;
import java.util.List;

public class SpotDataDto {
	private List<SpotDto> vacateSpot=new ArrayList<>();
	private List<SpotDto> occupiedSpot = new ArrayList<>();
	
	public SpotDataDto(List<SpotDto> vacateSpot) {
		super();
		this.vacateSpot = vacateSpot;
	}
	public List<SpotDto> getVacateSpot() {
		return vacateSpot;
	}
	public void setVacateSpot(List<SpotDto> vacateSpot) {
		this.vacateSpot = vacateSpot;
	}
	public List<SpotDto> getOccupiedSpot() {
		return occupiedSpot;
	}
	public void setOccupiedSpot(List<SpotDto> occupiedSpot) {
		this.occupiedSpot = occupiedSpot;
	}
}
