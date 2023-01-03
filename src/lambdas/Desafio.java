package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio { 

	public static void main(String[] args) {
		/* 1. A partir do produto calcular o preco real (com desconto);
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >=3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		DecimalFormat df = new DecimalFormat("#.00");//para poder formatar as casas decimais
		
		Produto p = new Produto("iPad", 3000.0, 0.1);
		
		//1º
		BinaryOperator<Double> precoComDesconto =
				(n1, n2) -> (n1 - (n1 * n2));
		
		//2º
		UnaryOperator<Double> imposto = (n) -> n >= 2500 ? n + (n * 0.085) : n;
		
		//3º
		UnaryOperator<Double> frete = (n) -> n <= 3000 ? n + 100 : n + 50;
		
		//4º/5°
		Function<Double, String> escrever = n -> {
			return "R$"+ df.format(n);
		};
		
		/*
		 * dois métodos de conseguir o mesmo resultado, por facil entendimento 
		 * eu prefiro o primeiro método, mesmo tendo mais linhas e mais comandos
		 * é uma forma mais facil de compreender o código.
		 */
		double precoFinal = precoComDesconto.apply(p.preco, p.desconto);
		precoFinal = imposto.apply(precoFinal);
		precoFinal = frete.apply(precoFinal);
		System.out.println(escrever.apply(precoFinal));
		//ou
		System.out.println(precoComDesconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(escrever)
				.apply(p.preco, p.desconto));
	}
}
