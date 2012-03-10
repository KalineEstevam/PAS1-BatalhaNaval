import java.util.List;


public class Jogo {

	private Tabuleiro tabuleiro;
	private List<Barco> listaDeBarcos;
	
	public Jogo(Tabuleiro tab){
		this.tabuleiro = tab;
	}
	
	
	public void criarJogo(int l, int a) throws TabuleiroException{
		if(l <= 0){
			throw new TabuleiroException("Largura invalida: "+ String.valueOf(l));
		}else if(a <= 0){
			throw new TabuleiroException("Altura invalida: "+ String.valueOf(a));
		}
		if(l < tabuleiro.getLargMin() || a < tabuleiro.getAltMin()){
			throw new TabuleiroException("Largura e Altura devem ser maiores que 2");
		}
		tabuleiro.setAlt(a);
		tabuleiro.setLarg(l);
	}
	
	public void addBarcoJogo(String nome , int tamanho)throws BarcoException{
		
		Barco barcoNovo = new Barco(nome, tamanho);
		
		if(nome.contains("%#") || nome.contains("&#6")){
			throw new BarcoException("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
		}else if(nome.startsWith("s")){
			throw new BarcoException("Nome invalido ''");
		}
		
		if(barcoNovo.getNome().equals("BARCO_GRANDE")){
			throw new BarcoException("Ja existe um barco com o nome 'BARCO_GRANDE' no jogo");
		}
			else{
				listaDeBarcos.add(barcoNovo);
		}
	}
	
	public void addBarcoNoTabuleiro(Tabuleiro tab, String nome)throws BarcoException{
		
		Tabuleiro tabuleiro = new Tabuleiro();
	}


	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}


	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	
	
}
