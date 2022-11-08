package controle.exercicio;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a 1º nota: ");
		double nota1 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		System.out.print("Digite a 2º nota: ");
		double nota2 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		double media = (nota1 + nota2)/2;
		
		if(media <= 10 && media >= 7) {
			System.out.printf("A sua média é %.2f você está Aprovado!", media);
		}else if(media <= 6.9 && media >= 4) {
			System.out.printf("A sua média é %.2f você está Recuperação!", media);
		}else {
			System.out.printf("A sua média é %.2f você está Reprovado!", media);
		}
		entrada.close();
	}
}
