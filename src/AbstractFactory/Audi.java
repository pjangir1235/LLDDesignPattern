package AbstractFactory;

public class Audi implements Vehicle {

	@Override
	public int getAverage() {
		System.out.print("Average of Audi : ");
		return 7;
	}

}
