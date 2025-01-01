package parkingLot.payment;

public class UPIPayment implements PaymentInterface {

	@Override
	public boolean doPayment() {
		System.out.println("UPI Payment Done");
		return true;
	}
}
