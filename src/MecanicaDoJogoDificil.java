
public class MecanicaDoJogoDificil implements MecanicaDoJogo {
	private String palavra, proximaPalavra;
	private int vida;
	private int pontos;
	
	BancoDePalavras bancoDePalavras = new BancoDePalavras();
	FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
	
	public MecanicaDoJogoDificil(){
	       this.vida = 1;
	       this.pontos = 0;
	       gerarNovaPalavra();
   }

	@Override
    public boolean verificarPalavra(String palavra){
       if(palavra.toUpperCase().equals(getPalavra())){
           return true;
       }
       return false;
	}
	
	@Override
    public int verificarVida() {
        return vida;
    }

	@Override
    public void perderVida(){
        this.vida--;
    }

	@Override
    public int verificarPontos() {
        return pontos;
    }

	@Override
    public String getPalavra() {
        return palavra;
    }
    
    @Override
    public String embaralharPalavra() {
    	Embaralhador embaralhador = fabricaEmbaralhadores.retonarEmbaralhador();
        this.proximaPalavra = embaralhador.embaralharPalavra(getPalavra());
        return proximaPalavra;
    }

    @Override
    public void gerarNovaPalavra(){
        this.palavra = bancoDePalavras.palavraAleatoria();
        embaralharPalavra();
    }

    @Override
    public void acertarPalavra(int n){
        this.pontos+= n*2;
    }
}