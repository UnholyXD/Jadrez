package boardgame;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas<1 || colunas<1) {
			throw new BoardException("Erro ao criar o tabuleiro, tem q ser no mínimo 1 linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinha() {
		return linhas;
	}


	public int getColuna() {
		return colunas;
	}

	public Peca peca (int linhas, int colunas) {
		if(!posicaoExiste(linhas, colunas)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return pecas[linhas][colunas];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocaPeca(Peca peca, Posicao posicao) {
		if(temUmaPeca(posicao)) {
			throw new BoardException("Já existe uma peça na posição"+ posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	public boolean posicaoExiste(int linhas, int colunas) {
		return linhas>=0 && linhas<linhas && colunas<colunas && colunas>=0;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return peca(posicao) != null;
	}
}
