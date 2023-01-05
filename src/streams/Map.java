package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		
//		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

		System.out.println("\n\nUsando composição");
		marcas.stream()
			.map(Map02.maiuscula)
			.map(Map02.primeiraLetra)
			.map(Map02.grito)
			.forEach(print);;
	}
}
