package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		/*
		 * Estruturas de controle não são terminadas com 
		 * ponto e virgula.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double nota = entrada.nextDouble();
		
		if(nota <= 10 && nota >=7) {
			System.out.println("Aprovado!");
		}
		
		if(nota < 7 && nota >=4.5) {
			System.out.println("Recuperação");
		}
		
		boolean criterioDeReprovacao = nota < 4.5 && nota >= 0;
		if(criterioDeReprovacao) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
