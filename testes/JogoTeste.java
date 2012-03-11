import static org.junit.Assert.*;
import org.junit.Test;

public class JogoTeste {
	
	Tabuleiro tab = new Tabuleiro();
    Jogo jogo = new Jogo(tab);
	
	@Test
	public void addBarcoJogo() throws BarcoException{
		try{
			jogo.addBarcoJogo("%#", 3);
			fail("Teste");
		}catch(BarcoException e){
			assertEquals(e.getMessage(), "Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
		}
		try{
			jogo.addBarcoJogo("%#6", 3);
			fail("Teste");
		}catch(BarcoException e){
			assertEquals(e.getMessage(), "Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
		}
		try{
			jogo.addBarcoJogo("s", 3);
			fail("Teste");
		}catch(BarcoException e){
			assertEquals(e.getMessage(), "Nome invalido ''");
		}
		try{
			jogo.addBarcoJogo("BARCO_GRANDE", 21);
		}catch(BarcoException e){
			assertEquals(e.getMessage(), "Barco nao cabe no tabuleiro");
		}
		try{
			jogo.addBarcoJogo("BARCO_GRANDE", 15);
		}catch(BarcoException e){
			assertEquals(1 , jogo.getQuantDeBarcos());
		}
		try{
			jogo.addBarcoJogo("BARCO_GRANDE", 15);
			fail("O teste falhou");
		}catch(BarcoException e){
			assertEquals(e.getMessage(), "Ja existe um barco com o nome 'BARCO_GRANDE' no jogo");
		}
		try{
			jogo.addBarcoJogo("LANCHA", 3);
		}catch(BarcoException e){
			assertEquals(2 , jogo.getQuantDeBarcos());
		}
		
		
		
	}
	@Test
	public void criarJogo() throws TabuleiroException{
		try{
			jogo.criarJogo(20, 10);
		}catch(TabuleiroException e){
			assertEquals(20,jogo.getTabuleiro().getLarg());
			assertEquals(10,jogo.getTabuleiro().getComp());
			assertEquals(0,jogo.getTabuleiro().getQtdeBarcos());
		}
		
	}
}