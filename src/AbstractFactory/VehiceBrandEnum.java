package AbstractFactory;

public enum VehiceBrandEnum {
	TATA("TATA"),
	MAHINDRA("MAHINDRA"),
	AUDI("AUDI"),
	BMW("BMW");
	private String name;
	VehiceBrandEnum(String s) {
		name=s;
	}
}
