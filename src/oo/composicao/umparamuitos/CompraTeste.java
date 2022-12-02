package oo.composicao.umparamuitos;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "João Pedro";
		
		//adicionando itens a partir da "Compra", usando um tipo de relação bidirecional.
		compra1.adicionarItem(new Item("Caneta", 20 , 7.45));
		
		//também usando a relação bidirecional pra criar um item 
		//a partir do metodo "adicionarItem" que está na classe "Compra"
		compra1.adicionarItem("Caderno", 3 , 18.79);
		
		//adicionando itens a partir do "Item".
		compra1.itens.add(new Item("Borracha", 12 , 3.89));
		//[new Item()] é por conta que eu estou criando a partir do meu construtor
		
		
		System.out.println(compra1.itens.size());
		double valorTotal = compra1.obterValorTotal();
		System.out.println("O valor total da minha compra é: "+ valorTotal);
		
		//Só para comstrar a relação bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total é: " + total);
		//também não faz sentido usar esse tipo de relação
	}
}
