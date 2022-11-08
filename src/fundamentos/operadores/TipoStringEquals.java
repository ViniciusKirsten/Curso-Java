package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		/*
		 * O indicado é não comparar Strings com "=="
		 * pois pode sempre haver uma resposta errada
		 * o indicado é sempre comprar com "equal"
		 */
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		/*
		 * equals vai comparar os conteudos
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("Mostrando o valor sem o equals: " + ("2" == s2.trim()));
		/* 
		 * "trim()" serve para tirar os espaços em brancos na string
		 */
		System.out.println("Mostrando o valor com o equals: "+("2".equals( s2.trim())));
		
		
		entrada.close();
		/*
		 * O next tira os espaços em brancos até os que 
		 * estão no meio da frase.
		 * entrada.next()
		 * 
		 * O nextLine registra todos os espaços em brano
		 * entrada.nextLine()
		 */
	}
}
