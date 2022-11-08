package classe.desafio.produto;

public class ProdutoDesafio {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	ProdutoDesafio(){
	 
	}
	double precoComDesconto(){
		return preco * (1 - desconto);
	}

	
}