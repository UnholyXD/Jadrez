package chess;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PecaXadrez extends Peca{
	private Colors cor;

	public PecaXadrez(Tabuleiro tabuleiro, Colors cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	public Colors getColor() {
		return cor;
	}	


}
