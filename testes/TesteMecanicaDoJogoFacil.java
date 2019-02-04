import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteMecanicaDoJogoFacil {

	private MecanicaDoJogoFacil mecanicaDoJogoFacil;
	@Before 
	public void inicializarMecanica() {
		mecanicaDoJogoFacil = new MecanicaDoJogoFacil();
	}
	
	@Test
	public void verificarPalavraCerta() {
		String palavra = "heranca";
		//coloquei o print para saber se a palavra confere ou não com que foi passado.
		System.out.println(mecanicaDoJogoFacil.getPalavra());
		assertEquals(true, mecanicaDoJogoFacil.verificarPalavra(palavra));
	}
	
	@Test
	public void verificarPalavraErrada() {
		String palavra = "heranca";
		//coloquei o print para saber se a palavra confere ou não com que foi passado.
		System.out.println(mecanicaDoJogoFacil.getPalavra());
		assertEquals(false, mecanicaDoJogoFacil.verificarPalavra(palavra));
	}
	
	@Test
	public void verificarVida() {
		assertEquals(3, mecanicaDoJogoFacil.verificarVida());
	}
	
	@Test
	public void perderVida() {
		verificarPalavraErrada();
		mecanicaDoJogoFacil.perderVida();
		assertEquals(2, mecanicaDoJogoFacil.verificarVida());
	}
	
	@Test
	public void verificarPontos() {
		mecanicaDoJogoFacil.verificarPontos();
		assertEquals(0, mecanicaDoJogoFacil.verificarPontos());
	}
	
	@Test
	public void contabilizarPontos() {
		String palavra = "heranca";
		verificarPalavraCerta();
		mecanicaDoJogoFacil.acertarPalavra(palavra.length());
		assertEquals(7, mecanicaDoJogoFacil.verificarPontos());
	}

}