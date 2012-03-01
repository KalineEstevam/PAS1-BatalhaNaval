

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
		
	}
}
