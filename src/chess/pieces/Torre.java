package chess.pieces;

import boardgame.Tabuleiro;
import chess.PecaXadrez;
import chess.Colors;

public class Torre extends PecaXadrez{

	public Torre(Tabuleiro board, Colors color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
	
}	
