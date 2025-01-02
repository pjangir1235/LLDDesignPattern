package state;

public class ProductSelectionState implements VendingMachineState {

	@Override
	public void handleRequest() {
		System.out.println("Product Selection State");
	}

}
