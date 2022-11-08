package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		/*
		 * 99% das vezes que você usar um "switch" 
		 * vai ser com o "break".
		 */
		// if(bool) ...
		// while(bool) ...
		// for(;bool;) ...]
		// switch --> você passa o valor
		
		String faixa = "preta";
		
		// passei o valor para ele executar --> "faixa"
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei p Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		}
		/*
		 * sem o break se a primeira for verdadeira
		 * ele vai executar todas em seguir, pois 
		 * como não tem o break tudo a seguir tbm
		 * será verdadeiro
		 */
		
		int idade = 3;
		switch(idade) {
		case 3:
			System.out.println("Sabe ler!");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
	}
}
