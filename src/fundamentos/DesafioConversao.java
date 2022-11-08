package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		/*
		 * - scanner.
		 * - 3 strings --> ultimos três salarios.
		 * - calcular a média.
		 * - pode separar com virgula ou com ponto
		 */
		
		// Abrindo o scanner
		Scanner ler = new Scanner(System.in);
		
		String valor1, valor2, valor3;
		
		System.out.print("\nDigite o 1° valor: ");
		valor1 = ler.nextLine().replace(",", ".");
		double num1 = Double.parseDouble(valor1);
		
		System.out.print("\nDigite o 2° valor: ");
		valor2 = ler.nextLine().replace(",", ".");
		double num2 = Double.parseDouble(valor2);
		
		System.out.print("\nDigite o 3° valor: ");
		valor3 = ler.nextLine().replace(",", ".");
		double num3 = Double.parseDouble(valor3);
		
		double media = ( num1 + num2 + num3)/3;
		
		System.out.println("Média: "+ media );
		
		// Fechando o scanner
		ler.close();
		
	}
}
