package state;

public class MainClass {
	public static void main(String[] args) {
		VendingMachineContext context =new VendingMachineContext();
		context.setState(new ReadyState());
		context.request();
		
		context.setState(new ProductSelectionState());
		context.request();
		
		context.setState(new PaymentState());
		context.request();
		
		context.setState(new OutOfStockState());
		context.request();
		
		

	}
}
