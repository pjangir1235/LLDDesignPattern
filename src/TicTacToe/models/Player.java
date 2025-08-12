package TicTacToe.models;

import javafx.util.Pair;

public class Player {
	public String name;
	public Piece piece;
	public PlayerTypeEnum pType;
	
	Player(String name, Piece piece, PlayerTypeEnum pType){
		this.name=name;
		this.piece=piece;
		this.pType= pType;
	}

	public Pair<Integer, Integer> getMove(Board board) {
		return null;
	}
}
