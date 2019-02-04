import java.util.Random;

public class FabricaEmbaralhadores {
	public Embaralhador retonarEmbaralhador() {
		Random random = new Random();
		int i = random.nextInt(101);
		if(i% 2 == 0) {
			return new EmbaralhadorPadrao();
		}
		return new EmbaralhadorAleatorio();
	}
}