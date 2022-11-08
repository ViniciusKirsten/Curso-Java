package controle;

public class For1 {

	public static void main(String[] args) {
		/*
		* int cont = 1;
		* while(cont <= 20) {
		* 	System.out.printf("i = %d \n", cont);
		* 	cont++;
		* }
		* 
		* transformando um "while" em uma estrutura de repetição "for"
		*/
		
		/*
		 * "int contador = 0"
		 * Definição da variavel
		 * 
		 * "contador <= 20"
		 * Expressão 
		 * 
		 * "contador+=2"
		 * Incremento
		 */
		for (int contador = 0; contador <= 20; contador+=2) {
			System.out.printf("i = %d \n", contador);
		}
		
		/*
		 * ***SEM ALGUMAS CONDIÇÕES**
		 * 
		 * A estrutura não precisa necessariamente ter 
		 * tudo setado quando vc cria ela. Somente ter 
		 * algo semelhante com o exemplo abaixo.
		 * 
		 * Mas não faz muito sentido existir esse tipo 
		 * de estrutura.
		 * 
		 * int x =2;
		 * for(; x <10;) {
		 *		System.out.println("-->"+x);
		 * x++;
		 * }
		 * 
		 * ***LAÇOS INFINITOS***
		 * posso criar um laço infinito 
		 * desse modp
		 * 
		 * for(;true;) {
		 * 		System.out.println("infinito");
		 * }
		 * 
		 * 				ou
		 * 
		 * for(;;){
		 * 		System.out.println("infinito");
		 * }
		 */
		
	}
}
