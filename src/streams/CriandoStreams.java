package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System. out::print;
		Consumer<Object> print02 = System. out::print;
		
		//Formas de criar uma Stream.
		
		//1º forma usando "Stream.of" passando os valores literais.
		Stream<String> linguagem = Stream.of("Java ", "Lua ", "JS\n");
		linguagem.forEach(print);
		
		String[] maisLinguagem = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		//2º forma usando o mesmo "Stream.of" passando um array.
		Stream.of(maisLinguagem).forEach(print);
		
		//3º forma a partir de "Arrays.setream".
		Arrays.stream(maisLinguagem).forEach(print);
		
		//4º forma alem de passar o array você dizer o subconjunto dos arrays
		Arrays.stream(maisLinguagem, 1, 3).forEach(print);
		//Dos elementos 1 até o 3 sem mostrar o elemento 3.
		
		//5º forma a partir das collections
		List<String> outraLinguagem = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outraLinguagem.stream().forEach(print);
		outraLinguagem.parallelStream().forEach(print);//vai mostrar mas não necessariamente na ordem
		
		//Stream 'infinita'
		Stream.generate(() -> "a").forEach(print);//vai gerar ums stream potencialmente infinita sem ordem.
		Stream.iterate(0 , n -> n + 1).forEach(print02);//porem aqui voce ja tem uma ordenação
	}
	
}
