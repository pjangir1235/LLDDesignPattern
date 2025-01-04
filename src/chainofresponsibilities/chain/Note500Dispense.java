package chainofresponsibilities.chain;

import chainofresponsibilities.Amount;

public class Note500Dispense implements DispenserChain {
	DispenserChain chain;
	
	@Override
	public void setNextChain(DispenserChain chain) {
		this.chain=chain;
	}

	@Override
	public void Dispense(Amount amount) {
		int val=amount.getAmount()/500;
		int rem=amount.getAmount()%500;
		System.out.println("Withdraw "+val+" notes of 500");
		if(rem!=0)
			chain.Dispense(new Amount(rem));
	}

}
