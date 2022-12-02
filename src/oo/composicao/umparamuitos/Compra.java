package oo.composicao.umparamuitos;

import java.util.ArrayList;

public class Compra {

	String cliente;
	/*
	 * Agora uma classe compra tem muitos itens.
	 * 
	 *  porque o meu ArrayList vai guardar diversos itens 
	 *  dentro dele.
	 */
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//relação bidirecional que tambem pode ser usada
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	//relação bidirecional
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this; //"this" seria a minha classe atual
	}
	
	double obterValorTotal() {
		double total = 0;
		
		//percorrendo o ArrayList para somar os valores de todos os itens
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		//retornando o valor toda adas compras percorrendo o ArrayList
		return total;
	}
}
