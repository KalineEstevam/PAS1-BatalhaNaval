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
			jogo.addBarcoJogo("", 3);
			fail("Teste");
		}catch(BarcoException e){
			assertEquals(e.getMessage(), "Nome invalido ''");
		}
	}

}
