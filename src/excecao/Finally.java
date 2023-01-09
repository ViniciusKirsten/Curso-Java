package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {				
			System.out.println(7 / entrada.nextInt());

		}catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			/*
			 * O finally sempre é chamado
			 * 
			 * SEMPRE será chamado o finally
			 * 
			 * ex: estamos usando o finally por conta que precisamos
			 * fecha o scanner "entrada" dessa forma usamos mesmo que 
			 * acontecer um erro dentro do 'try' durante a divisão ele
			 * pula direto para o 'catch' assim não executando o 
			 * 'entrada.close', porem se ele estiver dentro do finally 
			 * ele vai ser executado mesmo mesmo o código gerando um erro.
			 */
			System.out.println("Finally..");
			entrada.close();
		}
		
		//Não precisa necessariamente ter um catch
		try {				
			System.out.println(7 / entrada.nextInt());

		} finally {
			System.out.println("Finally..");
			entrada.close();
		}
		System.out.println("Fim!");
	}
}
