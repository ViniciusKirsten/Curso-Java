package lambdas;

import java.util.function.Function;

public class Funcao {

	/*
	 * Funções muito granser com muitas responsabilidades 
	 * dificilmente será reutilizada dentro do sistema, por
	 * serem muito especificas. 
	 */
	public static void main(String[] args) {
		//Posso escolher o parametro que vou receber e o parametro que vai retornar.
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";//lambda + Operador Ternario.
				
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado é " + valor;
		
		Function<String, String> empolgado =
				valor -> valor + "!!!";
		 //dessa forma eu fiz o encadeamento de funções uma atás da outra.
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		//andThen --> "e então" o resulto é.
		
		System.out.println(resultadoFinal);
	}
}
