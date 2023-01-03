package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma Tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		/* Vou passar uma função lambda para dizer 
		 * o que ela vai fazer com cada um dos elementos
		 * 
		 * Dessa forma fica muito mais simples de fazer o foreach
		 */
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println); //duas vezes os dois pontos entre out e println
	
		
		System.out.println("\nLambda #02...");
		aprovados.forEach((nome) -> meuImprimir(nome)); //usnado o lambda e usando o meu metodo criado
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é "+ nome);
	}
}
