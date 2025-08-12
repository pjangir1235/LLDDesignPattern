package TicTacToe;

import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		GamePlayService service =new GamePlayService();
		try {
			System.out.println("Winner is "+service.startPlay());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
