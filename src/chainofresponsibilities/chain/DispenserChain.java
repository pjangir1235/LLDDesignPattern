package chainofresponsibilities.chain;

import chainofresponsibilities.Amount;

public interface DispenserChain {

	public void setNextChain(DispenserChain chain);

	public void Dispense(Amount amount);
}
