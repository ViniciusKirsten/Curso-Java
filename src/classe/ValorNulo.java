package classe;

public class ValorNulo {

	public static void main(String[] args) {
		String s1 = "";
		
		System.out.println(s1.concat("!!!!!")); 
		/*
		 *  posso chamar os valores mesmo com uma string vazia,
		 *  pois existe um endereço de memória que aponta para uma 
		 *  string que foi criada.
		 */
		
		// String s2; --> assim vai dar um erro de compilação, alguma regra da linguagem foi violada
		//String s2 = null; --> nesse caso nenhuma regra foi violada, na hora de executar vai dar um problema tempo de execução
		//System.out.println(s2.concat("!!!"));
		/*
		 * vai dar o erro "NullPointerException": é você ter uma variavel nula
		 * e essa variavael nula você vai tentar acessar algum atributo dessa
		 * variavel nula, seja um atributo ou um comportamento.
		 */
		/*
		 * poid sempre que chamar uma variavel ela tem que apontar para um espaço de memoria, 
		 * se a variavel for chamada e está setada como nulo ela não vai apontar para nenhum 
		 * espaço de memória e o código vai dar um erro de execução.
		 */
		
		
	}
}
