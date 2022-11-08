package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		
		System.out.print("Digite o valor da nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito ="A";
			break;
		//posso colocar bloco de código dentro de um case
		case 8: case 7:{ 
			conceito ="B";
			break;
		}
		//posso usar dessa forma tbm
		case 6: 
		case 5: 
			conceito ="C";
			break;
		case 4: case 3: 
			conceito ="D";
			break;
		case 2: case 1: case 0: 
			conceito ="E";
			break;
		//posso mover o default para qualquer posição
		default:
			System.out.println("Nota invalida");
		}
		/*
		 * Em Java não permite definir um intervalo 
		 * por exemplo, quere colocar do case (9  até 5).
		 * Devo colocar todos os "case" juntos exemplo:
		 * 
		 * case 10: case 9:
		 * 		conceito ="A";
		 * 		break;
		 */
		System.out.println("Conceito: " + conceito);
		
		entrada.close();
	}
}