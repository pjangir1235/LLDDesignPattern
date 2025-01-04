package command;

public class TV implements Device {

	@Override
	public void turnOn() {
		System.out.println("TV turn On");

	}

	@Override
	public void turnOff() {
		System.out.println("TV turn Off");

	}

	void ChangeChannel() {
		System.out.println("Channel Channel");
	}

}
