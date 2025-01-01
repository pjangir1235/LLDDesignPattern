package parkingLot.payment;

public class CashPayment implements PaymentInterface {

	@Override
	public boolean doPayment() {
		System.out.println("Cash Payment Done");
		return true;
	}

}
