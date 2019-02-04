import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteMecanicaDoJogoDificil {
	private MecanicaDoJogoDificil mecanicaDoJogoDificil;
	
	@Before 
	public void inicializarMecanica() {
		mecanicaDoJogoDificil = new MecanicaDoJogoDificil();
	}
	
	@Test
	public void verificarPalavraErrada() {
		String palavra = "heranca";
		System.out.println(mecanicaDoJogoDificil.getPalavra());
		assertEquals(false, mecanicaDoJogoDificil.verificarPalavra(palavra));
	}
	
	@Test
	public void verificarPalavraCerta() {
		String palavra = "heranca";
		System.out.println(mecanicaDoJogoDificil.getPalavra());
		assertEquals(true, mecanicaDoJogoDificil.verificarPalavra(palavra));
	}

	@Test
	public void verificarVida() {
		assertEquals(1, mecanicaDoJogoDificil.verificarVida());
	}
	
	@Test
	public void perderVida() {
		verificarPalavraErrada();
		mecanicaDoJogoDificil.perderVida();
		assertEquals(0, mecanicaDoJogoDificil.verificarVida());
	}
	
	@Test
	public void contabilizarPontos() {
		String palavra = "heranca";
		verificarPalavraCerta();
		mecanicaDoJogoDificil.acertarPalavra(palavra.length());
		assertEquals(14, mecanicaDoJogoDificil.verificarPontos());
	}
}