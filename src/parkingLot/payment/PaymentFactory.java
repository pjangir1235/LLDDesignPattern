package parkingLot.payment;

public class PaymentFactory {
	public PaymentInterface getPayment(String payment) {
		switch(payment.toUpperCase()){
			case "CASH" : return new CashPayment();
			case "UPI" : return new UPIPayment();
			default : return new CashPayment();
		}
	}

}
