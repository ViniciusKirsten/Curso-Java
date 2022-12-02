package oo.composicao.desafio;

public class Item {

	//essa seria a relação com produto, como cada item 
	//pertence a um produto não sera com um ArrayList
	final Produto produto;
	final int quantidade;
	
	//eu coloco dentro do meu construtor a instancia criada do 
	//objeto "Produto", junto com a quantidade do produto
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade= quantidade;
	}
	//Dessa forma o contrutor vai poder receber objetos?
}
