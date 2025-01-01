package builder;

public class ComputerBuilder {
	//required field
	int ramSize;
	int HDDSize;
	//OptionalField
	boolean isGraphic;
	boolean isBluetooth;
	public ComputerBuilder(int ramSize, int hDDSize) {
		super();
		this.ramSize = ramSize;
		HDDSize = hDDSize;
	}
	
	public ComputerBuilder isGraphic(boolean isGraphic) {
		this.isGraphic = isGraphic;
		return this;
	}
	
	public ComputerBuilder isBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
		return this;
	}
	
	public Computer build() {
		return new Computer(this);
	}
	
	
}
