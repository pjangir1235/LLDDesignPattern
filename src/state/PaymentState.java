package state;

public class PaymentState implements VendingMachineState {

	@Override
	public void handleRequest() {
		System.out.println("Payment State");
	}

}
