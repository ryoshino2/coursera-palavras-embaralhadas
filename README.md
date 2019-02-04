<h3>Jogo das Palavras Embaralhadas</h3>
O objetivo desse exercício é criar um jogo onde partes de sua execução possam ser trocadas. 
<br>O jogo é simples: é apresentado ao jogador uma palavra com as letras embaralhadas e o jogador deve tentar adivinhar a palavra correta. 
<br>O jogo será jogado no próprio console e a lista de palavras utilizadas pode ser fixa (pelo menos 20).
<br>A classe Scanner pode ser utilizada para ler a entrada do usuário no console.
O jogo deve possuir os seguintes componentes com as seguintes responsabilidades:<br>
<ul>
	<li> <i>Principal</i>: representa a classe com o método main(). É essa classe que é responsável por ler a entrada do usuário e por imprimir as informações no console. Nenhuma outra classe pode imprimir ou ler do console.</li>
	<li> <i>BancoDePalavras</i>: classe que possui um método que retorna uma palavra retirada aleatóriamente de uma lista de palavras lida a partir de um arquivo.</li>
	<li> <i>Embaralhador</i>: interface que representa classes reponsáveis por receber uma palavra e retornar ela embaralhada. Pelo menos duas implementações deverão ser feitas.</li>
	<li> <i>FabricaEmbaralhadores</i>: possui um método que retorna um embaralhador aleatóriamente.</li>
	<li> <i>MecanicaDoJogo</i>: interface que representa o andamento e a lógica do jogo. É responsável por ditar o andamento do jogo. Ela que vai dizer se o jogo acabou ou não, se o usuário acertou a
	palavra ou não, se o usuário pode tentar acertar a palavra novamente e qual foi a pontuação final do jogador. Pelo menos duas implementações dessa interface devem ser criadas.</li>
	<li><i>FabricaMecanicaDoJogo</i>: retorna a MecanicaDoJogo que deve ser utilizada</li>
</ul>

A classe Principal deve recuperar a instância de MecanicaDoJogo de FabricaMecanicaDoJogo e não pode conter nenhuma referência direta a uma das implementações, apenas a interface. 
<br>Da mesma forma, as implementações de MecanicaDoJogo devem recuperar os embaralhadores de FabricaEmbaralhadores e também não pode conter nenhuma referência direta a implementações de Embaralhador, apenas a interface.
<br>As implementações de embaralhador devem conter algoritmos para o embaralhamento de palavras. 
<ul>
	<li>Exemplo: inverter string, permutar randomicamente, trocar letras impares por pares e etc...</li> 
</ul>
	As implementações de MecanicaDoJogo devem retratar o andamento do jogo.
	<ul> 
	<li>Exemplos de questões que podem mudar: quando o jogo termina (após um número fixo de palavras, após um número de erros); quantas tentativas podem ser feitas por palavra; como são computados os pontos; qual embaralhador será utilizado e em que momento; e etc...</li> 
	</ul>
<br>O importante é que independente do funcionamento, a classe Principal deverá interagir com ele da mesma forma.
<br>DICA É você quem irá definir as interfaces! Então se houver alguma informação que precise saber daquela a respeito da implementação, inclua um método que retorna aquela informação. Exemplo: um embaralhador pode gerar uma mistura mais difícil que outros, então se caso essa informação seja relevante (para pontuação, por exemplo) crie um método na interface Embaralhador que retorne sua dificuldade.