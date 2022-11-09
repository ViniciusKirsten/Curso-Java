package classe.desafioModulo;

import java.util.Scanner;

public class Jantar {
	/*
	 * vai te o método main, criarum algoritmo para criar uma pessoa
	 * instanciar uma pessoa, instanciar duas comidas, fazer com que
	 * a pessoa com a comida.
	 * 
	 * instancia uma comida
	 * ex: 
	 * feijao 0.223
	 * arroz: 0.333
	 * 
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Pessoa pessoa1 = new Pessoa();
		Comida alimento1 = new Comida();
		
		System.out.print("Digite o nome da pessoa:");
		pessoa1.nome = entrada.nextLine();
		System.out.print("Digite o peso da pessoa:");
		pessoa1.peso = Double.parseDouble(entrada.nextLine().replace(",", "."));
		
		System.out.print("Digite o nome do alimento: ");
		alimento1.nomeComida = entrada.nextLine();
		System.out.print("Digite o peso do alimento: ");
		alimento1.pesoComida = Double.parseDouble(entrada.nextLine().replace(",", "."));
		
		System.out.printf("Comeu %s [S/N]: ",alimento1.nomeComida);
		String comer = entrada.nextLine();
		
		if(comer.equalsIgnoreCase("s")) {
			pessoa1.Comer(alimento1.pesoComida);
		}else if(comer.equalsIgnoreCase("n")) {
			System.out.println("Pessoa não jantou!!");
		}
		System.out.printf("A %s está com %.2f", pessoa1.nome, pessoa1.peso);
		
		entrada.close();
	}
}
