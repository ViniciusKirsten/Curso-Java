package fundamentos;

//import do scanner
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//JOGANDO DADOS NO CONSOLE	
		
		//escrevendo na mesma linha
		System.out.print("Bom");
		System.out.print(" dia!");
		
		//escrevendo em duas linha separadas
		System.out.println("Bom");
		System.out.println("dia!");
		
		//escrevendo de uma forma simplificada
		System.out.printf("Megasena %d %d %d %d %d %n", 1, 2, 3, 4, 5);
												// ^ posso usar para quebrar linha
		
		//ESNTRADA DE DADOS NO CONSOLE
		
		//usando o import do 'java.util'
		Scanner entrada = new Scanner(System.in);
									// ^ entrada do sistema
		
		System.out.print("Digite o seu nome: ");
		String nome =  entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome =  entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade =  entrada.nextInt();
							// ^ referece para dar o próximo inteiro

		/*
		 * para entrar dados de diferentes tipos 
		 * tem que se usar 'nextTIPODEDADO()'.
		 * 
		 * ex:
		 * nextLine() --> para dados tipo string
		 * nextInt() -- para dados tipo inteiro
		 * ...
		 * 
		 * existe todos os tipos premitivos para 
		 * entrada de dados.
		 * 
		 * **OBS**
		 * 
		 * porém tomando cuidado pois o nextInt na hora que digitamos o enter 
		 * ele vai ler o enter juntamente com o numero digitado, e esse enter vai
		 * ser interpretado com "\n" e para corrigir isso devemos usar. 
		 * 
		 * ************************************************************************
		 * System.out.println("Qual a sua idade?");
		 * int idade = teclado.nextInt();
		 * telcado.nextLine() //lê o "\\n" que o teclado.nextInt() deixa para trás.
		 * ************************************************************************
		 * dessa forma não havera erro.
		 */
		
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		
		//fechando o Scanner, pois ele fica ocupando recurso da maquina
		entrada.close();
	}
}
