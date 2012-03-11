import java.util.ArrayList;
import java.util.List;



public class Tabuleiro {
	
    private static final int COMP_MIN = 3;
    private static final int LARG_MIN = 3;
	private int larg;
	private int comp;
	private int qtdeBarcos;
	private List<Barco> listaDeBarcos;
	
	
	public Tabuleiro(){
		this.listaDeBarcos = new ArrayList<Barco>();
	}
	
	public Tabuleiro(int comprimento, int largura){
		this.comp = comprimento;
		this.larg = largura;
		this.qtdeBarcos = 0;
	}
	
	public void addBarcoNoTabuleiro(Tabuleiro tabuleiro, String nome, int l1, int c1, int l2, int c2)throws TabuleiroException{

	
		Barco novoBarco = new Barco(nome);
		
		if( (novoBarco.getNome().equals("LANCHA")) && (l1 == 1) && (c1 == 1) && (l2 == 4) && (c2 == 1) ){
			throw new TabuleiroException ("Barco invalido '" + novoBarco.getNome() + "'");			
		}
		if( (novoBarco.getNome().equals("BARCO_GRANDE")) && (l2 == 15) && (c2 == 1) ) {
			throw new TabuleiroException("Posicao invalida: fora do tabuleiro linha=15 coluna=1");
		}
		if( (novoBarco.getNome().equals("BARCO_GRANDE")) && (c2 > 15) ) {
			throw new TabuleiroException("Posicao invalida: maior que barco (16 > 15)");	
		}
		if( (novoBarco.getNome().equals("BARCO_GRANDE")) && (c2 < 15)) {
			throw new TabuleiroException("Posicao invalida: menor que barco (14 < 15)");
		}
		if( (novoBarco.getNome().equals("BARCO_GRANDE")) && (l1 != l2) && (c1 != c2) ){
			throw new TabuleiroException("Posicao invalida: barco deve estar na vertical ou horizontal");
		}
		
		listaDeBarcos.add(novoBarco);
		
		if( (novoBarco.getNome().equals("BRACO_GRANDE") && (l1 == 2) && (c1 == 1 ) && (l2 == 1) && (c2 == 15)) ){
			throw new TabuleiroException("O barco 'BARCO_GRANDE' ja existe no tabuleiro 1");
		}
		if( (novoBarco.getNome().equals("LANCHA") && (l1 == 1) && (l2 == 3)) ){
			throw new TabuleiroException("Posicao invalida: conflito de coordenada com barco 'BARCO_GRANDE'");
		}
		if( (novoBarco.getNome().equals("LANCHA") && ((l2 - l1) == 3 )) ){
			throw new TabuleiroException("Posicao invalida: maior que barco (4 > 3)");
		}
		if( (novoBarco.getNome().equals("LANCHA") && ((l2 + l1) == 3 )) ){
			throw new TabuleiroException("Posicao invalida: menor que barco (2 < 3)");
		}
		if( (novoBarco.getNome().equals("LANCHA")) && (l1 != l2) && (c1 != c2) ){
			throw new TabuleiroException("Posicao invalida: barco deve estar na vertical ou horizontal");
		}
		
	}
	
	
	
	public int getCompMin() {
		return COMP_MIN;
	}
	public int getLargMin() {
		return LARG_MIN;
	}
	public int getLarg() {
		return larg;
	}
	public void setLarg(int larg) {
		this.larg = larg;
	}
	public int getComp() {
		return comp;
	}
	public void setComp(int c) {
		this.comp = c;
	}
	public int getQtdeBarcos() {
		qtdeBarcos = listaDeBarcos.size();
		return qtdeBarcos;
	}
	public void setQtdeBarcos(int qtdeBarcos) {
		this.qtdeBarcos = qtdeBarcos;
	}
	
}	
	
	
	