package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<? extends Object> lista) {
		/* <? extends Object> == <?>
		 * Quando colocamos o "extends Object" não faz muito sentido 
		 * até por que o object é o tipo mais genérico dentro do java
		 * o que faz mais sentido seria usar uma classe menos especifica
		 * que você mesmo criou ou que o java fornece, como "Number"
		 */
		return lista.get(lista.size() - 1);
	}
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C teste(A parametro, B parametroB) {
		C teste = null;
		return teste;
	}
}
