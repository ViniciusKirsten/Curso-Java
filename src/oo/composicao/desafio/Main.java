package oo.composicao.desafio;

public class Main {

	public static void main(String[] args) {
	
		//criando o cliente
		Cliente cliente = new Cliente("Maria Julia Moraes");
		
		//Criando a primeira compra
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);
		
		//Criando a segunda compra
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 10, 10);
		compra1.adicionarItem(new Produto("Impressora", 1000), 1);
		
		//adicionando as compras para o cliente
		cliente.adicionarCompra(compra1);// 1º forma usando o método "adicionarCompra()"
		cliente.compras.add(compra2);//2º forma adicionando direto no ArrayList
		
		System.out.println("Valor total das compras " + cliente.obterValorTotal());
	}
}
