import java.util.List;


public class Jogo {
	private Tabuleiro tabuleiro;
	private List<Barco> listaDeBarcos;
	
	public Jogo(Tabuleiro tab){
		tab.setAlt(20);
		tab.setLarg(20);
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
		if(nome.contains("%#") || nome.contains("&#6")){
			throw new BarcoException("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
		}else if(nome.contains("")){
			throw new BarcoException("Nome invalido ''");
		}	
		Barco barcoNovo = new Barco();
		listaDeBarcos.add(barcoNovo);
	}
}
