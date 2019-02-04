import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class BancoDePalavras {

	private List<String> palavras = new ArrayList<String>();

	public BancoDePalavras() {
		try {
			String arquivo = ("./palavra/Palavras.txt");
			BufferedReader lerArquivo = Files.newBufferedReader(Paths.get(arquivo));
			palavras = lerArquivo.lines().collect(Collectors.toList());
			lerArquivo.close();
		} catch (IOException e) {
			System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
		}
	}

	public String palavraAleatoria() {
		Random random = new Random();
		int n = random.nextInt(palavras.size());
		return palavras.get(n).toUpperCase();
	}
}