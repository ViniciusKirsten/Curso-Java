package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		/*
		 * Calcular a média das notas de uma turma (0 até 10).
		 * E o número de notas digitadas.
		 * Só vai sair quando o usuario digitar "-1"
		 */
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		double nota = 0;
		int numNotas = 0;
		
		while(nota != -1) {
			System.out.print("\n**Digite [-1] para sair**");
			System.out.print("\nDigite a nota de um aluno:");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >=0) {
				total += nota;
				numNotas++;
			} else if(nota != -1) {
				System.out.println("Nota inválida!!");
			}
		}
		
		double media = total / numNotas;
		System.out.printf("%d provas tiveram a média %.2f", numNotas, media);
		entrada.close();
	}
}
