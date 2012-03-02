
public class Barco {
	private String nome;
	private int tamanho;
	private static final int TAM = 5;
	
	public Barco(){}
	
	public Barco(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	public Barco(String nome) {
		this.nome = nome;
		this.tamanho = TAM;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
