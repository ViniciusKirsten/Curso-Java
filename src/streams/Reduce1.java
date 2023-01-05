package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1 ,2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acumulador, n)-> acumulador +n;
		
		/* reduce é uma função terminadora, não podendo encaixar
		 * nenhum outro stream.
		 */
		Integer total1 = nums.stream().reduce(soma).get();
		///usamos a função 'get' para pegar o resultado gerado
		System.out.println(total1);
		
		Integer total2 = nums.parallelStream().reduce(100, soma);
		/* Por conta do 'ParallelStream'
		 * Como eu passei o valor inicial eu não preciso colocar 
		 * o 'get' pois assim ele entende que o valor é inteiro.
		 * 
		 * Se fosse somente 'stream' só seria acrescentando o valor 
		 * 100 
		 */
		System.out.println(total2);
		
		//Resultado foi um Optional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);;
	}
}
