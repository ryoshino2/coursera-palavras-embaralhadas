import java.util.Random;

public class EmbaralhadorAleatorio implements Embaralhador {

	@Override
	public String embaralharPalavra(String palavra) {
		Random random = new Random();
		char[] letra = palavra.toCharArray();
		char letraAtual;
		int tamanhoArray = palavra.length();
		
		for(int i = 0; i<tamanhoArray - 1;i++) {
			int j = (random.nextInt(tamanhoArray-1));
            letraAtual = letra[j];
            letra[j] = letra[j+1];
            letra[j + 1] = letraAtual;
        }  
		palavra = String.copyValueOf(letra);
		return palavra;
	}
}