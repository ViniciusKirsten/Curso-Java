package controle.exercicio;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num = entrada.nextInt();
		
		if(num <= 10 && num >= 0) {
			System.out.println("O valor está no intervalo de 0 até 10! ");
		}else {
			System.out.println("O valor não está no intervalo de 0 até 10!");
		}
		
		
		entrada.close();
	}
}
