package TicTacToe.models;

import javafx.util.Pair;

public class PlayerBot extends Player {

	public PlayerBot(String name, Piece piece) {
		super(name, piece, PlayerTypeEnum.BOT);
	}

	public Pair<Integer, Integer> getMove(Board board) {
		
		for(int i=0;i<board.size;i++) {
			for(int j=0;j<board.size;j++) {
				if(board.pieceArray[i][j]==null) {
					return new Pair<>(i,j);
				}
			}
		}
		return null;
	}

}
