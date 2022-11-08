package controle.exercicio;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ((ano % 100) !=0)  || ano % 400 == 0) {
			System.out.println("Esse ano é bissexto");
		}else {
			System.out.println("Esse ano não é bissexto");
		}
		
		entrada.close();
	}
}
