package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando o for tradicional...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nUsando o foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * ele vai verificar se existe um próximo elemento 
		 * se tiver ele vai ir para o próximo, percorrendo
		 * todos os elementos.
		 */
		
		//stream == fluxo
		System.out.println("Usando Stream....");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);//Laço interno!!
	}
}
