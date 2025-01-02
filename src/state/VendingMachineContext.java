package state;

public class VendingMachineContext {
	private VendingMachineState state;

	public VendingMachineContext() {
		super();
		this.state = new ReadyState();
	}

	public void setState(VendingMachineState state) {
		this.state = state;
	}

	public void request() {
		state.handleRequest();
	}

}
