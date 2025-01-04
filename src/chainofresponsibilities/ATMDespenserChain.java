package chainofresponsibilities;

import chainofresponsibilities.chain.DispenserChain;
import chainofresponsibilities.chain.Note100Dispense;
import chainofresponsibilities.chain.Note10Dispense;
import chainofresponsibilities.chain.Note500Dispense;

public class ATMDespenserChain {
	DispenserChain chain;

	public ATMDespenserChain() {
		DispenserChain chain100Rs = new Note100Dispense();
		DispenserChain chain10Rs = new Note10Dispense();

		chain = new Note500Dispense();

		chain.setNextChain(chain100Rs);
		chain100Rs.setNextChain(chain10Rs);
	}

	public void dispenseMoney(int amount) {
		chain.Dispense(new Amount(amount));
	}
}
