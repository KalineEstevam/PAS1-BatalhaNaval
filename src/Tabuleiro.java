

public class Tabuleiro {
	
    private static final int ALT_MIN = 3;
    private static final int LARG_MIN = 3;
	private int larg;
	private int alt;
	private int qtdeBarcos;
	
	
	public Tabuleiro(){

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
	
	
	