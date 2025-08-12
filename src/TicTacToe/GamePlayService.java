package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

import TicTacToe.models.*;
import javafx.util.Pair;

public class GamePlayService {
	Deque<Player> deque = new LinkedList<Player>();
	Board board;
	boolean isWin = false;
	BufferedReader br;

	GamePlayService() {
		br = new BufferedReader(new InputStreamReader(System.in));
		gameInitialize();
	}

	private void gameInitialize() {

		board = new Board(3);
		deque.add(new PlayerReal("Piyush", new PieceDollar()));
		deque.add(new PlayerBot("Jangir", new PieceX()));

	}

	public String startPlay() throws IOException {
		String winner = "Tie";
		while (!isWin) {
			board.printBoard();
			Player currentPlayer = deque.getFirst();
			Pair<Integer, Integer> moveCombination = getMove(currentPlayer);

			boolean isValid = board.isValidMove(moveCombination.getKey(), moveCombination.getValue());
			if (!isValid) {
				System.out.println("Piece already full try again!");
				continue;
			}
			board.pieceArray[moveCombination.getKey()][moveCombination.getValue()] = currentPlayer.piece;
			isWin = checkWinner(currentPlayer);
			if (isWin) {
				return currentPlayer.name;
			}
			deque.addLast(deque.poll());

		}
		return winner;

	}

	private boolean checkWinner(Player currentPlayer) {
		Piece piece = currentPlayer.piece;

		// row
		for (int i = 0; i < board.size; i++) {
			int j = 0;
			for (; j < board.size; j++) {
				if (board.pieceArray[i][j] != piece) {
					break;
				}
			}
			if (j == board.size) {
				return true;
			}
		}

		// col
		for (int i = 0; i < board.size; i++) {
			int j = 0;
			for (; j < board.size; j++) {
				if (board.pieceArray[j][i] != piece) {
					break;
				}
			}
			if (j == board.size) {
				return true;
			}
		}

		// diagonal
		for (int i = 0, j = 0; i < board.size; i++, j++) {
			if (board.pieceArray[i][j] != piece) {
				break;
			}
			if (i == board.size-1) {
				return true;
			}
		}

		// anti-diagonal
		for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
			if (board.pieceArray[j][i] != piece) {
				break;
			}
			if (i == board.size-1) {
				return true;
			}
		}
		return false;
	}

	private Pair<Integer, Integer> getMove(Player player) throws IOException {

		if (player.pType==PlayerTypeEnum.REAL) {
			System.out.println(player.name + " : Enter row and col");
			String valString = br.readLine();
			int row = Integer.parseInt(valString.split(" ")[0]);
			int col = Integer.parseInt(valString.split(" ")[1]);
			return new Pair<Integer, Integer>(row, col);
		} else {
			System.out.println(player.name + " played");
			return player.getMove(board);
		}

	}

}
