package chess;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import chess.pieces.Rei;
import chess.pieces.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro= new Tabuleiro(8,	8);
		configuracaoInicial();
	}
	
	public PecaXadrez[][] getPeca(){
		PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		
		for(int i=0; i<tabuleiro.getLinha(); i++) {
			for (int j = 0; j < tabuleiro.getColuna(); j++) {
				matriz [i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return matriz;
	}
	
	private void configuracaoInicial() {
		tabuleiro.colocaPeca(new Torre(tabuleiro, Colors.WHITE), new Posicao(2, 1));
		tabuleiro.colocaPeca(new Rei(tabuleiro, Colors.BLACK), new Posicao(0, 4));
		tabuleiro.colocaPeca(new Rei(tabuleiro, Colors.WHITE), new Posicao(7, 4));
	}
	
}
