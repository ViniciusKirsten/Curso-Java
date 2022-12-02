package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//criando a relação com "Item" 
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	//posso criar um método que vai criar um produto junto com a quantidade de itens
	void adicionarItem(String nome, double preco, int quantidade) {
		
		//Alem de adicionar a quantidade de produtos posso criar um novo produto
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto , quantidade));
		/*
		 * POSSO USAR ESSE MÉTODO TBM
		 * this.itens.add(new Item(new Produto(nome, preco) , quantidade));
		 */
	}
	
	double valorTotal() {
		double total = 0;
		
		for(Item item: this.itens) {
			total += (item.quantidade * item.produto.preco);
			/*
			 * item: variavel ultilizada no foreach
			 * 
			 * item.quantidade: como "item" é a variavel do meu foreach
			 * eu vou ter como coletar informações dentro do ArrayList, 
			 * essa informação expecifica é de um dos itens com sua 
			 * quantidade e valor que foram atrinuidads na sua construção.
			 * 
			 * item.produto.preco: com a variável "item" do foreach, consigo 
			 * acressas os itens que estão dentro daquele espaço dentro da lista
			 * então usando o objeto "produto" consigo acessar a variavel preço
			 * que está atribuida a esse objeto.
			 */
		}
		
		return total;
	}
}
