package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		 /*
		  * "if(...)" uma sentença; ou "{bloco}"
		  * 
		  * "while(...)" uma sentença; ou "{bloco}"
		  * 
		  * "fo( ...; ...; ...)" uma sentença; ou "{bloco}"
		  *
		  * "do" uma sentenca, ou {bloco} "while(..);"
		  */
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas: ");
			System.out.println("Quer sair? ");
			valor = entrada.nextLine();
		}while(!valor.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
