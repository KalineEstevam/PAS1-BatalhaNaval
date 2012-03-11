
import static org.junit.Assert.*;

import org.junit.Test;

public class TabuleiroTeste {
	
	Tabuleiro tabuleiro = new Tabuleiro();
	Tabuleiro tabuleiro1;
    Jogo jogo = new Jogo(tabuleiro);
	
	@Test
	public void criarJogo() throws TabuleiroException{
		jogo.criarJogo(20, 10);
		
		assertEquals(10,tabuleiro.getComp());
		assertEquals(20,tabuleiro.getLarg());
		
		
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
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "LANCHA", 1, 1, 4, 1);
			fail("O teste falhou");
		}catch(TabuleiroException e){
			assertEquals("Barco invalido 'LANCHA'", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "BARCO_GRANDE", 1, 1, 15, 1);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: fora do tabuleiro linha=15 coluna=1", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "BARCO_GRANDE", 1, 1, 1, 16);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: maior que barco (16 > 15)",e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "BARCO_GRANDE", 1, 1, 1, 14);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: menor que barco (14 < 15)", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "BARCO_GRANDE", 1, 1, 2, 15);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: barco deve estar na vertical ou horizontal", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "BARCO_GRANDE", 2, 1, 2, 15);
		}catch(TabuleiroException e){
			assertEquals("O barco 'BARCO_GRANDE' ja existe no tabuleiro 1", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "LANCHA", 1, 3, 3, 3);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: conflito de coordenada com barco 'BARCO_GRANDE'", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "LANCHA", 1, 1, 3, 1);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: conflito de coordenada com barco 'BARCO_GRANDE'", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "LANCHA", 1, 15, 3, 15);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: conflito de coordenada com barco 'BARCO_GRANDE'", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "LANCHA", 1, 16, 4, 16);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: maior que barco (4 > 3)", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "LANCHA", 1, 16, 2, 16);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: menor que barco (2 < 3)", e.getMessage());
		}
		try{
			tabuleiro.addBarcoNoTabuleiro(tabuleiro1, "LANCHA", 2, 1, 4, 4);
		}catch(TabuleiroException e){
			assertEquals("Posicao invalida: barco deve estar na vertical ou horizontal", e.getMessage());
		}
			
	}
}