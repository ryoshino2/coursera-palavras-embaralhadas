public class FabricaMecanicaDoJogo {
	public MecanicaDoJogo retornarMecanica(int opcao){	
		if(opcao ==1){
			return new MecanicaDoJogoFacil();
		}
		return new MecanicaDoJogoDificil();
	}
}