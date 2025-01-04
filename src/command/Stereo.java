package command;

public class Stereo implements Device {

	@Override
	public void turnOn() {
		System.out.println("TV turn On");

	}

	@Override
	public void turnOff() {
		System.out.println("TV turn Off");

	}

	void ChangeVolume() {
		System.out.println("Change Volume");
	}

}
