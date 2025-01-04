package chainofresponsibilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ATMDespenserChain dispenser = new ATMDespenserChain();
		while (true) {
			System.out.println("Enter amount to dispatch ");
			int amount = Integer.parseInt(br.readLine());

			if (amount % 10 == 0) {
				dispenser.dispenseMoney(amount);
			} else if (amount == -1) {

				System.out.println("Sytem Exit");
				break;
			} else {
				System.out.println("Invalid Amount!");
			}
		}
	}
}
