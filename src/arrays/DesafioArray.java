package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double totalNotas = 0;
		
		System.out.print("Quantas notas o aluno tem? ");
		int numNotas = Integer.parseInt(entrada.nextLine());
		
		double[] notas = new double [numNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("informe a %dº nota: ", (i+1));
			notas[i] = Double.parseDouble(entrada.nextLine());
		}
		
		for(double nota: notas) {
			totalNotas += nota;
		}
		System.out.printf("A média do aluno foi %.2f", (totalNotas / notas.length));
		
		entrada.close();
		/*
		 * poderia ter feito tudo dentro do mesmo "for" 
		 * porém o exercio pedia para ser desse jeito
		 */
	}
}
