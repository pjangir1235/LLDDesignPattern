package builder;

public class Computer {
	//required Field
	private int ramSize;
	private int HDDSize;
	//OptionalField
	private boolean isGraphic;
	private boolean isBluetooth;
	public Computer(ComputerBuilder builder) {
		super();
		this.ramSize = builder.ramSize;
		this.HDDSize = builder.HDDSize;
		this.isGraphic = builder.isGraphic;
		this.isBluetooth = builder.isBluetooth;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getHDDSize() {
		return HDDSize;
	}
	public void setHDDSize(int hDDSize) {
		HDDSize = hDDSize;
	}
	public boolean isGraphic() {
		return isGraphic;
	}
	public void setGraphic(boolean isGraphic) {
		this.isGraphic = isGraphic;
	}
	public boolean isBluetooth() {
		return isBluetooth;
	}
	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}
	@Override
	public String toString() {
		return "Computer [ramSize=" + ramSize + ", HDDSize=" + HDDSize + ", isGraphic=" + isGraphic + ", isBluetooth="
				+ isBluetooth + "]";
	}
	
	
	
	
	
}
