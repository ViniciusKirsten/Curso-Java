package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		/*
		 * Quando você tem uma restrição de tamanho na pilha o "add" vai retornar verdadeiro
		 * ou falso e o push um erro na compilação.
		 */
		livros.add("O pequeno principe");//retornar ou não, vai retornar verdadeiro ou falso
		livros.push("Don Quixote");//não vai retornar nada quando adicionar
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		/*
		 * TODAS AS FUNCIONALIDADES SÃO IGUAIS A "FILA"
		 */
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());//resulta um erro 
		System.out.println(livros.element());//resulta um erro
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());//resultado false
		
		/*
		 * tudo igual exatamente a nossa classe "fila"
		 * 
		 * livros.size();
		 * livros.clear();
		 * livros.isEmpty();
		 */
		
		
	}
}
