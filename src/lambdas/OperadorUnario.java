package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(5);
		System.out.println(resultado1);
		/* Como funciona:
		 * - execute maisDois
		 * - execute vezesDois
		 * - execute aoQuadrado
		 * - aplicar '5'
		 */
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(6);
		System.out.println(resultado2);
		/* Como funciona:
		 * - antes de aplicar aoQuadrado
		 * - antes de aplicar vezesDois
		 * - antes de aplicar maisDois
		 * - aplicar '6'
		 */
	}
}
