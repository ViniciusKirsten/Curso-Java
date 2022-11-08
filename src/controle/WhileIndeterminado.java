package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		 * 1- crio a string vazia.
		 * 2- nego o valor
		 * 3- comparo com a palavra sair, usando o 
		 * "equalsIgnoreCase" para fazer essa comparação 
		 * e ignorar se estão maiusculas ou minusculas.
		 */
		
		String valor = "";//
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		
		System.out.println("Você saiu!!");
		
		entrada.close();
	}
}
