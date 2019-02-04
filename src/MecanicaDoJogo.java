
public interface MecanicaDoJogo {
	boolean verificarPalavra(String palavra);
	int verificarVida();
	int verificarPontos();
	void perderVida();
	void acertarPalavra (int n);	
	String getPalavra();
	String embaralharPalavra();
    void gerarNovaPalavra();
}