package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioResolucao {

	//Essa é a resposta passada pelo professor do desafio "binary operator".
	public static void main(String[] args) {
		/* 1. A partir do produto calcular o preco real (com desconto);
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >=3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		Produto p = new Produto("iPad", 3235.89, 0.13);

		//1°
		Function<Produto, Double> precoFinal =
				produto -> produto.preco * (1 - produto.desconto);
		//2°
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500? preco * 1.085 : preco;

		//3°
		UnaryOperator<Double> frete =
				preco -> preco >= 3000 ? preco + 100: preco + 50;
		
		//4°
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f", preco));
		/*
		 * Esse erro acontece por conta da localidade, na maquina do professor não precisava
		 * esse tipo de comando, porém na minha maquina é necessario, pois a localidade está 
		 * como Brasil.
		 */
		//5º
		Function<Double, String> formatar=
				preco -> ("R$"+ preco).replace(".", ",");
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final é "+preco);
	}
}
