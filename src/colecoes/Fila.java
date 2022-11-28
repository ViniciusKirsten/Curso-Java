package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//ADICIONAR ELEMENTOS NA FILA
		fila.add("Ana");
		/*
		 * a diferença entre o "add" e o "offer" é que quando você tem
		 * uma restrição de tamanho em uma fila, o "add" tenta adicionar
	     * e se não tiver mais esço causa um erro, o "offer" caso não 
	     * tenha mais espaço ele retorna falso
		 */
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		

		//PEGAR ELEMENTOS NA FILA
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		/*
		 * o comportamento dos dois vai diferir quando a fila estiver vazia 
		 * enquanto o "peek" retorna um valor null, o "element" retorna um 
		 * erro de compilação.
		 */
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//Mostra a quantidade de objetos inseridos na fila
		//fila.size();
		
		//exclui elementos todos os elementos da fila
		//fila.clear();
		
		//para saber se a fila está ou não vazia
		//fila.isEmpty();
		
		//para saber se um objeto está contido ou não
		//fila.contains(...);
		
		System.out.println("\n[Chamando e excluindo o primeiro item da fila]");
			
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//vai retornar um valor "null" por conta que exclui todos os objetos da fila
		System.out.println(fila.poll());
		
		// mesma funcionalidade do "poll" porém ele vai retorna um erro
		System.out.println(fila.remove());
	}
}