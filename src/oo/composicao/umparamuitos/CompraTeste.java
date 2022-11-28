package oo.composicao.umparamuitos;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "João Pedro";
		//adicionando itens a partir da compra
		compra1.adicionarItem(new Item("Caneta", 20 , 7.45));
		
		
		compra1.itens.add(new Item("Borracha", 12 , 3.89));
		compra1.itens.add(new Item("Caderno", 3 , 18.79));
		
		System.out.println(compra1.itens.size());
		double valorTotal = compra1.obterValorTotal();
		System.out.println("O valor total da minha compra é: "+ valorTotal);
	}
}
