package controle.exercicio;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num = Double.parseDouble(entrada.nextLine().replace(",", "."));
		int contadorDeDivisores = 0;
		for (int i = 2; i < num; i++) {
			if(num % i ==0) {
				contadorDeDivisores++;
			}	
		}
		
		if(contadorDeDivisores == 0) {
			System.out.printf("O número %f é primo.", num);
		}else {
			System.out.printf("O número %.2f não é primo.", num);
		}
		entrada.close();
	}
}
