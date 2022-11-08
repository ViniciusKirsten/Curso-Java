package classe.desafio.produto;

import java.util.Scanner;

public class ProdutoDesafioTeste {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		ProdutoDesafio produto1 = new ProdutoDesafio();
		produto1.nome = "Notebook Acer"; 
		produto1.preco = 4356.89;
		
		ProdutoDesafio produto2 = new ProdutoDesafio();
		produto2.nome = "Caneta Preta ";
		produto2.preco = 100;
		
		System.out.print("Desconto sobre data comemorativa:");
		ProdutoDesafio.desconto = ProdutoDesafio.desconto + Double.parseDouble(entrada.nextLine());
		
		double precoFinal1 = produto1.precoComDesconto();
		double precoFinal2 = produto2.precoComDesconto();
		
		System.out.printf("\nPreço final do %s é: R$%.2f", produto1.nome, precoFinal1);
		System.out.printf("\nPreço final do %s é: R$%.2f", produto2.nome, precoFinal2);
		
		entrada.close();
	}
}