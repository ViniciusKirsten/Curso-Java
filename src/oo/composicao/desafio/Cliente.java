package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	//essa seria a minha relação com "Compra"
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra c: compras) {
			/*
			 * Nesse caso eu vou usar um método que é la de "Compra"
			 * onde ele multiplica o valor de cada produto pela quantidade
			 * de itens que foram comprados daquele produto, assim somando 
			 * o resutado de cada compra.
			 * 
			 * Aqui ele vai somar o total de todas as compras.
			 */
			total += c.valorTotal();
		}
		
		return total;
	}
}
