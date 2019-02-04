import java.util.Random;

public class EmbaralhadorPadrao implements Embaralhador{
	
	@Override
	public String embaralharPalavra(String palavra) {
		char[] letra = palavra.toCharArray();
		char letraAtual;
		int tamanhoArray = palavra.length();
		Random random = new Random();
		
		for (int i = 0; i < tamanhoArray-1; i++) {
			int j = random.nextInt(tamanhoArray-1);
            	if(i == j) {
                letraAtual= letra[i];
                letra[i] = letra[j+1];
            	}else {
            	letraAtual= letra[i];
            	letra[i] = letra[j];
            	}
                letra[j] = letraAtual;
        } 		
		palavra = String.copyValueOf(letra);
		return palavra;
		}
}