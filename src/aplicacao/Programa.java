package aplicacao;

import chess.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {
		
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		UI.printBoard(partidaXadrez.getPeca());
		
	}

}
