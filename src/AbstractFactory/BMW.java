package AbstractFactory;

public class BMW implements Vehicle {

	@Override
	public int getAverage() {
		System.out.print("Average of BMW : ");
		return 6;
	}

}
