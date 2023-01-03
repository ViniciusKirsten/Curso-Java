package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = //recebe um valor e não retorna nada
				p -> System.out.println(p.nome + "!!!");//lambda
		
		Produto p1 = new Produto("Caneta", 122.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2222.34, 0.25);
		Produto p3 = new Produto("Caderno", 12.3, 0.03);
		Produto p4 = new Produto("Borracha", 2.5, 0.18);
		Produto p5 = new Produto("Lapis", 1.1, 0.19);
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println); //funciona com toString
	}
}
