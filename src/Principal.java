import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String nivel, tentarNovamente;
		final Scanner scanner = new Scanner(System.in);
		do {
			final MecanicaDoJogo mecanicaDoJogo;
			final FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new FabricaMecanicaDoJogo();
			System.out.println("Insira o nivel que quer jogar: \n" + "1 - Nivel facil (Tem 3 vidas) \n"
					+ "2 - Nivel dificil (Tem 1 vida)");
			do {
				nivel = scanner.nextLine();
				if (!nivel.equals("1") && !nivel.equals("2"))
					System.out.println("Opcao invalida. Digite novamente");
			} while (!nivel.equals("1") && !nivel.equals("2"));
			mecanicaDoJogo = fabricaMecanicaDoJogo.retornarMecanica(Integer.parseInt(nivel));
			do {
				System.out.println("Adivinhe a palavra:");
				System.out.println(mecanicaDoJogo.embaralharPalavra());
				System.out.println("Digite sua resposta:");
				final String palavra = scanner.nextLine();
				if (mecanicaDoJogo.verificarPalavra(palavra)) {
					System.out.println("Certa resposta");
					mecanicaDoJogo.acertarPalavra(mecanicaDoJogo.getPalavra().length());
					mecanicaDoJogo.gerarNovaPalavra();
				} else {
					System.out.println("Resposta errada");
					System.out.println("A palavra correta era: " + mecanicaDoJogo.getPalavra());
					mecanicaDoJogo.perderVida();
					if (mecanicaDoJogo.verificarVida() > 0) {
						mecanicaDoJogo.gerarNovaPalavra();
					}
					System.out.println("Ainda restam: " + mecanicaDoJogo.verificarVida() + " vida(s).");
				}
			} while (mecanicaDoJogo.verificarVida() > 0);
			System.out.println("O jogo acabou!\n" + "Sua pontuacao foi de " + mecanicaDoJogo.verificarPontos()
					+ " pontos.\n" + "Gostaria de jogar novamente: " + "1 - Sim; 2 - Nao");
			do {
				tentarNovamente = scanner.nextLine();
				if (!tentarNovamente.equals("1") && !tentarNovamente.equals("2")) {
					System.out.println("Opcao invalida, tente novamente.");
				}
			} while (!tentarNovamente.equals("1") && !tentarNovamente.equals("2"));
		} while (tentarNovamente.equals("1"));
		System.out.println("Jogo finalizado!");
		scanner.close();
	}
}