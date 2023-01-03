package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro =  //recebe um parametro e retorna verdadeiro ou falso
				produto -> (produto.preco * (1 - produto.desconto)) >= 750;//lambda
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);		
		
		System.out.println(isCaro.test(produto));
	}
}
