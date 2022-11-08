package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		// criando o scanner
		Scanner entrada = new Scanner(System.in);		
		
		/*
		 * Todos esses seria a classe dos tipos primitivos.
		 * 
		 * OBS: todos eles precisam estar com a letra maiuscula no começo para,
		 * identificar que eles são as classes dos tipo primitivos..
		 */

		Byte b = 100; // byte

		Short s = 1000; //short

		Integer i = 10_000; //int

		/*
		 * preiso colocar esse L no final do numero literal para que ele etenda que
		 * estou querendo colocar um long dentro da classe long.
		 */
		Long l = 100_000L; //long
		
		//TIPOS PRIMITIVOS EM CLASSES
		System.out.println("\nValor de Byte: " + b.byteValue());
		System.out.println("\nValor de Short mas como string: " + s.toString());
		System.out.println("\nValor de Interger: " + i);
		System.out.println("\nValor de Interger: " + l);
		
		//INTERAÇÃO COM O SCANNER PARA INTEIRO
		System.out.print("\nDigite um valor: ");
		Integer e = Integer.parseInt(entrada.nextLine());// convertendo uma string para um valor inteiro.
		System.out.println("\nValor de Interger com a entrada de dados, vezes três: " + (e * 3));
		
		//COM PONTO FLUTUANTE
		Float f = 123.10F; //float
		             // ^ esse 'f' serve para transformar de double para float
		System.out.println("\nValor do tipo float: " + f);
		
		Double d = 1234.5678;
		System.out.println("Valor do tipo double: " + d);
		
		
		//BOOLEANOS
		Boolean bo = Boolean.parseBoolean("true"); //boolean
		System.out.println("\n\nValor booleano: " + bo);
		System.out.println("\n\nValor string transformado do booleano: " + bo.toString().toUpperCase());
		
		//CARACTER
		Character c = '#'; //char 
		System.out.println(c + "...");
		
		// fechando o scanner
		entrada.close();
		
		
	}
}
