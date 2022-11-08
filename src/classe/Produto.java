package classe;

public class Produto {
	/*
	 * Criei uma classe só que sem um método "main",
	 * então quando eu quiser criar objeto ou instanciar 
	 * novos objetos os objetos criados terão esses 
	 * mesmos três atributos.
	 */
	String nome;
	double preco;
	double desconto;
	
	/*
	 * Adicionando de forma explicita o meu construtor padrão
	 */ 
	 Produto(){
	 
	}
	 
	Produto(String nomeInicial){
				  // ^ --> essa variavel só estara ativa 
				  // quando ele estiver construindo o objeto.
		nome =nomeInicial;
	}
	
	//caso eu queira posso criar mais um construtor que vai receber dois valores
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	/*
	 * Não vou precisar associar nada no meu método 
	 * pois eu já vou ter os meu parâmetros de entrada
	 * dentro do meu objeto
	 */
	double precoComDesconto(){
		return preco * (1 - desconto);
	}

	
}
