package chainofresponsibilities.chain;

import chainofresponsibilities.Amount;

public class Note100Dispense implements DispenserChain {
	DispenserChain chain;
	
	@Override
	public void setNextChain(DispenserChain chain) {
		this.chain=chain;
	}

	@Override
	public void Dispense(Amount amount) {
		int val=amount.getAmount()/100;
		int rem=amount.getAmount()%100;
		System.out.println("Withdraw "+val+" notes of 100");
		if(rem!=0)
			chain.Dispense(new Amount(rem));
	}

}
