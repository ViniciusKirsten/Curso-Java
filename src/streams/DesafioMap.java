 package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		Consumer<String> print = System.out::println;
		Consumer<Integer> print02 = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//1º
		Function<Integer, String> converter = num -> Integer.toBinaryString(num);
		
		//2º
		UnaryOperator<String> inverter = binario ->
					binario = new StringBuilder(binario).reverse().toString();
		
		//3º
		Function<String, Integer> retornar = num ->Integer.parseInt(num , 2);
					
		System.out.println("Convertendo os numeros...");
		nums.stream().map(converter).forEach(print);
		
		System.out.println("\nInvertendo os números...");
		nums.stream().map(converter).map(inverter).forEach(print);
		
		System.out.println("\nRetornando os números para decimal...");
		nums.stream().map(converter).map(inverter).map(retornar).forEach(print02);
		
		
	}
}
