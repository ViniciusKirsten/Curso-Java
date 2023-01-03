package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).test(22));
		/* Ambos tem que ser verdadeiros tanto "isTresDigitos" quanto
		 * "isPar".
		 */
		System.out.println(isPar.and(isTresDigitos).negate().test(22));
		/* quando eu coloco o "negate" eu estou negando o anterior, que 
		 * nesse caso seria o "isTresDigitos" e assim somente o "isPar"
		 * sendo verdadeiro o resultado já vai ser verdadeiro.
		 */
		System.out.println(isPar.or(isTresDigitos).test(22));
		/*nesse caso por ter o "or" quando qualquer um ser verdadeiro
		 * o resultado vai ser verdadeiro.
		 */
		
	}
}
