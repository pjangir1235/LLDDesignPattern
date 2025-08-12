package TicTacToe.models;

public class Board {
	public int size;
	public Piece[][] pieceArray;
	
	public Board(int size){
		this.size=size;
		pieceArray = new Piece[size][size];
	}
	
	
	public void printBoard() {
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(pieceArray[i][j]!=null)
					System.out.print(" "+pieceArray[i][j].pieceEnum.toString()+" ");
				else
					System.out.print("   ");
				if(j!=size-1) {
					System.out.print("|");
				}
			}

			System.out.println();
		}
	}


	public boolean isValidMove(Integer row, Integer col) {
		return pieceArray[row][col]==null?true:false;
		
	}


	
	
	
	
}
