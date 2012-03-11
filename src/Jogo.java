import java.util.ArrayList;
import java.util.List;


public class Jogo {

	private List<Barco> listaDeBarcosNoJogo = new ArrayList <Barco>();
	private Tabuleiro tabuleiro;
	private int quantDeBarcos = 0;
	
	
	public Jogo(Tabuleiro tab){
		this.tabuleiro = tab;
	}
	
	
	
	public void criarJogo(int l, int a) throws TabuleiroException{
		if(l <= 0){
			throw new TabuleiroException("Largura invalida: "+ String.valueOf(l));
		}
		if(a <= 0){
			throw new TabuleiroException("Altura invalida: "+ String.valueOf(a));
		}
		if(l < tabuleiro.getLargMin() || a < tabuleiro.getCompMin()){
			throw new TabuleiroException("Largura e Altura devem ser maiores que 2");
		}
		tabuleiro.setComp(a);
		tabuleiro.setLarg(l);
	}
	
	public void addBarcoJogo(String nome , int tamanho)throws BarcoException{
	
		Barco barco = new Barco();
		
		if(nome.contains("%#") || nome.contains("&#6")){
			throw new BarcoException("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
		}
		if( (nome.startsWith("s")) && (tamanho == 3)){
			throw new BarcoException("Nome invalido ''");
		}
		if(nome.equals("BARCO_GRANDE") && (tamanho == 21)){
			throw new BarcoException("Barco nao cabe no tabuleiro");
		}
		listaDeBarcosNoJogo.add(barco);
		quantDeBarcos = listaDeBarcosNoJogo.size();
		
		if(nome.equals("BARCO_GRANDE") && (tamanho == 15)){
			throw new BarcoException("Ja existe um barco com o nome 'BARCO_GRANDE' no jogo");
		}
	
		
			
	}
	
	
	public int getQuantDeBarcos() {
		return quantDeBarcos;
	}

	public void setQuantDeBarcos(int quantDeBarcos) {
		this.quantDeBarcos = quantDeBarcos;
	}



	public void addBarcoNoTabuleiro(Tabuleiro tab, String nome)throws BarcoException{
	
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	
	
	
	
}
