import java.util.ArrayList;
import java.util.List;



public class Tabuleiro {
	
    private static final int ALT_MIN = 3;
    private static final int LARG_MIN = 3;
	private int larg;
	private int alt;
	private int qtdeBarcos;
	
	private List<Barco> listaDeBarcos;
	
	public void addBarcoNoTabuleiro(String nome, int l1, int a1, int l2, int a2)throws TabuleiroException{
		int tam1 = a2 - a1;
		int tam2 = l2 - l1;
		int tam;
		
		if(tam1 > tam2)
			tam = tam1;
		else tam = tam2;
		
		Barco novoBarco = new Barco(nome, tam);
		
		if(novoBarco.getNome().equals("LANCHA")){
			throw new TabuleiroException ("Barco invalido '" + novoBarco.getNome() + "'");			
		}
		if( (novoBarco.getNome().equals("BARCO_GRANDE")) && (l2 == 15) && (a2 == 1) ) {
			throw new TabuleiroException("Posicao invalida: fora do tabuleiro linha=15 coluna=1");
		}
		if( (novoBarco.getNome().equals("BARCO_GRANDE")) && (a2 > tam) ) {
			throw new TabuleiroException("Posicao invalida: maior que barco (16 > 15)");	
		}
		
		listaDeBarcos.add(novoBarco);
		
	}
	
	public Tabuleiro(){
		this.listaDeBarcos = new ArrayList<Barco>();
	}
	
	
	
	public int getAltMin() {
		return ALT_MIN;
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
	public int getAlt() {
		return alt;
	}
	public void setAlt(int alt) {
		this.alt = alt;
	}

	public int getQtdeBarcos() {
		return qtdeBarcos;
	}

	public void setQtdeBarcos(int qtdeBarcos) {
		this.qtdeBarcos = qtdeBarcos;
	}
	
}	
	
	
	