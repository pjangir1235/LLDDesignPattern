package chainofresponsibilities.chain;

import chainofresponsibilities.Amount;

public class Note10Dispense implements DispenserChain {
	DispenserChain chain;
	
	@Override
	public void setNextChain(DispenserChain chain) {
		this.chain=chain;
	}

	@Override
	public void Dispense(Amount amount) {
		int val=amount.getAmount()/10;
		int rem=amount.getAmount()%10;
		System.out.println("Withdraw "+val+" notes of 10");
		if(rem!=0)
			chain.Dispense(new Amount(rem));
	}

}
