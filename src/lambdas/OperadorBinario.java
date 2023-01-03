package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		// Mesmo tipo de entrada, mesmo tipo de saida.
		BinaryOperator<Double> media =
				(n1, n2) ->(n1 + n2)/2;
		System.out.println(media.apply(9.8, 5.7));
		
		// Duas entradas e uma saida, podendo ser de tipos diferentes.
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2)/2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(7.6, 8.0));
		
		// Usando a função "media" e implementado a função "conceito"
		Function<Double, String> conceito =
				m -> m >= 7 ?"Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(9.7,  5.1));
	}
}
