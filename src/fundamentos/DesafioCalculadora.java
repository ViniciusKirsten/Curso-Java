package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		/*
		 * ler num1
		 * ler num2
		 * + - * / %
		 * 
		 * Obs: essa atividade não poderia ter nenhuma estrutura
		 * de repetição.
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = Double.parseDouble(entrada.next());
		
		System.out.print("Digite o segundo número: ");
		double num2 = Double.parseDouble(entrada.next());
		
		System.out.print("Digite a operação: ");
		String operacao = entrada.next();
		/*
		 * Poderia ter feito dessa forma também, modo como o professor fez.
		 * 
		 * double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		 * resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		 * resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		 * resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		 * resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		 * 
		 */
		
		Double resultado = "+".equals(operacao) ? num1 + num2 :
							"-".equals(operacao) ? num1 - num2 : 
							"*".equals(operacao) ? num1 * num2 :
							"/".equals(operacao) ? num1 / num2 :
							num1 % num2;
		
		
		System.out.printf("O resultado de %.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		entrada.close();
	}
}
