package chess.pieces;

import boardgame.Tabuleiro;
import chess.PecaXadrez;
import chess.Colors;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro board, Colors color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
	
}
