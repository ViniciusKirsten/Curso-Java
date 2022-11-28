package oo.composicao.umparamuitos;

public class Item {

	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	//criando um construtor
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
