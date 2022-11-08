package classe;


//import controle.Break; --> caso eu queria importar algum exercicio de outro pacote

public class ProdutoTeste {
	
	public static void main(String[] args) {
		/*
		 * como estou dentro do mesmo pacote usando a 
		 * classe "Produto" e "ProdutoTeste" eu não preciso
		 * importar a classe "Produto"
		 */
		//Break --> caso eu queria importar algum exercicio de outro pacote
		
		
		/*
		 * Comparando o scanner com uma variavel.
		 *
		 * int a = 3;
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * Tipo:
		 * --> "int"
		 * --> "Scanner"
		 * 
		 * Nome:
		 * --> "a"
		 * --> "entrada"
		 * 
		 * Atribuição:
		 * --> "="
		 * --> "="
		 * 
		 * “New” a palavra reservada que é responsável 
		 * por chamar um construtor. O nome do construtor 
		 * é exatamente o nome da classe.
		 */
		
		//usando o meu construtor com entrada de parâmetro.
		Produto produto1 = new Produto("Notebook");
		produto1.nome = "Notebook Acer"; //caso queira altera o valor posso fazer isso, pois continua sendo uma variavel
		produto1.preco = 4356.89;
		produto1.desconto = 0.25;
		
		//usando o meu construtor padrão que declarei de forma explicita.
		var produto2 = new Produto(); //Também posso usar para instanciar um produto
		produto2.nome = "Caneta Preta ";
		produto2.preco = 12.56;
		produto2.desconto = 0.29;
		
		System.out.println(produto1.nome);
		System.out.println(produto2.nome);
		
		/*
		 * Criando um objeto da minha classe "Produto"
		 * usando notação ponto para acessar e modificar
		 * os valor. E criando mais de um objeto de uma 
		 * unica classe ("Produto");
		 */
		double precoFinal1 = produto1.precoComDesconto();// modo novo usando o método criado em "Produto"
		/*
		 * Em "produto1" eu chamei um método criado na minha classe
		 * "Produto" onde o método retornava o valor com o desconto,
		 * tudo isso somente por conta que meu método tinha um retorno
		 */
		
		double precoFinal2 = produto2.preco * (1 - produto2.desconto);//modo antigo sem usar o método
		
		System.out.printf("\nPreço final do %s é: R$%.2f", produto1.nome, precoFinal1);
		System.out.printf("\nPreço final do %s é: R$%.2f", produto2.nome, precoFinal2);
		
	}
}
