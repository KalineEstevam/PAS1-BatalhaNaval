
import static org.junit.Assert.*;

import org.junit.Test;

public class TabuleiroTeste {
	
	Tabuleiro tab = new Tabuleiro();
    Jogo jogo = new Jogo(tab);
	
	@Test
	public void criarJogo() throws TabuleiroException{
		jogo.criarJogo(20, 10);
		
		assertEquals(10,tab.getAlt());
		assertEquals(20,tab.getLarg());
		
		
		try{
			jogo.criarJogo(2, 3);
			fail("");
		}catch(TabuleiroException e){
			assertEquals("Largura e Altura devem ser maiores que 2",e.getMessage());
		}
		
		try{
			jogo.criarJogo(3, 2);
			fail("");
		}catch(TabuleiroException e){
			assertEquals("Largura e Altura devem ser maiores que 2",e.getMessage());
		}
		
		try{
			jogo.criarJogo(-1, 15);
			fail("");
		}catch(TabuleiroException e){
			assertEquals("Largura invalida: -1",e.getMessage());
		}
		
		try{
			jogo.criarJogo(0, 15);
			fail("");
		}catch(TabuleiroException e){
			assertEquals("Largura invalida: 0",e.getMessage());
		}
		
		try{
			jogo.criarJogo(-1, -1);
			fail("");
		}catch(TabuleiroException e){
			assertEquals("Largura invalida: -1",e.getMessage());
		}
		try{
			tab.addBarcoNoTabuleiro("LANCHA", 1, 1, 4, 1);
			fail("O teste falhou");
		}catch(TabuleiroException e){
			assertEquals("Barco invalido 'LANCHA'", e.getMessage());
		}
		try{
			tab.addBarcoNoTabuleiro("BARCO_GRANDE", 1, 1, 15, 1);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: fora do tabuleiro linha=15 coluna=1", e.getMessage());
		}
		try{
			tab.addBarcoNoTabuleiro("BARCO_GRANDE", 1, 1, 1, 16);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: maior que barco (16 > 15)",e.getMessage());
		}
		
		
	}
}