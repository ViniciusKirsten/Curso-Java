package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	//tirado todas as advertencias por conta didaticca
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//metodo adicionar elementos
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String 
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); //char -> Char
		
		/*
		 * quando não atribuimos valores para a o colecttion
		 * tudo dentro dele é um objeto.
		 * 
		 * uma collection não suporta tipos primitivos, o que vai 
		 * acontecer aqui é que ele vai automaticamente converter
		 * [ double --> Double ] transformando de um tipo primitivo
		 * para uma classe.
		 * 
		 * posso adicionar vario tipos dentro do 
		 * mesmo conjunto, porém não é indicado.
		 */
		
		conjunto.add("Teste"); // ele vai continuar com 5 elementros pois não aceita valores repetidos
		
		System.out.println("Tamanho do conjunto: "+ conjunto.size()); // ".length" não tem a possibilidade, então usamos ".size"
		
		//metodo remover elementos
		System.out.println(conjunto.remove("test")); //ele vai remover por que "teste" está com o "t" minusculo, retornando false
		System.out.println(conjunto.remove("Teste"));// ele vai remover por que pertence ao conjunto, retornando true
		
		System.out.println("Tamanho do conjunto: "+ conjunto.size());
		
		//metodo para identificar se existe o valor dentro do conjunto
		System.out.println(conjunto.contains("Teste"));
		System.out.println(conjunto.contains(true));
		System.out.println(conjunto.contains(1));
		
		HashSet numeros = new HashSet();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		System.out.println(conjunto);
		
		//união entre os conjuntos
		conjunto.addAll(numeros);
		/*
		 * ele não mantém nenhuma ordem de inclusão
		 * pode adicionar os elementos de qualquer 
		 * forma, e o conteudo dentro dos dois conjuntos
		 * não vão se repetir
		 */
		
		// interseção dos conjuntos
		conjunto.retainAll(numeros);
		/*
		 * ou seja ele vai reter aquilo que está apenas no outro 
		 * conjunto e mostrar o valor que está em ambos os conjuntos
		 * ex:
		 * conjunto 1 = [1, 2, 3]
		 * conjunto 2 = [2, 4, 6]
		 * 
		 * interseção = [1] --> somente o número "1" repete nos dois conjuntos
		 */
		System.out.println(conjunto);
		
		//metodo limpar os atributos do conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}
}
