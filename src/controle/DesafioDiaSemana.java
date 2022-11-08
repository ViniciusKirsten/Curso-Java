package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		/*
		 * Domingo	--> 1
		 * Segunda	-->	2
		 * Terca	-->	3
		 * Quarta	-->	4
		 * Quinta	-->	5
		 * Sexta	-->	6
		 * Sabado	-->	7
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next(); 
		
		/*
		 * ".equalsIgnoreCase" 
		 * ignora se tem letras maiusculas ou minusculas.
		 * 
		 * if (dia.equalsIgnoreCase("domingo")) {
		 *		System.out.println("Domingo --> 1");
		 * {
		 * poderia ter feito dessa forma também, ambas 
		 * estariam certas.
		 * 
		 */
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("Domingo --> 1");
			
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Segunda --> 2");
			
		}else if("terca".equalsIgnoreCase(dia)) {
			System.out.println("Terça --> 3");
			
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Quarta --> 4");
			
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Quinta --> 5");
			
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Sexta --> 6");
			
		}else if("sabado".equalsIgnoreCase(dia)) {
			System.out.println("Sabado --> 6");
			
		}else {
			System.out.println("Dia inválido!");
		}
		
		entrada.close();
	}
}
