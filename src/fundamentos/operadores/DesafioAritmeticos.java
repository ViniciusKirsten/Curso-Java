package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int a = 3 *4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		/*
		 * Usando o Classe matematica para conseguir usar a potenciação
		 * 
		 * int b =  Math.pow(2, 3);
		 * 
		 * No caso acima eu uso a class "Math" e sua função "pow" de potencia,
		 * dentro dela eu coloco o primeiro numero que no exemplo é "2" no qual 
		 * vamos fazer a operação, na segunda casa vamos potencia, que no 
		 * exemlo é "3". 
		 * 
		 * 	int b = (int) Math.pow(a, 3);
		 *  Neste exemplo usando o castig  pois o resultado seria um double.
		 */
		
		//DESAFIO 
		
		double n1 = (6*(3 +2));
		n1 = Math.pow(n1, 2);
		n1 = n1 / (3*2);
		
		//posso usar essa forma também: double n1 = Math.pow( 6*(3 +2) ,  2 );  
		
		double n2 = (1-5)*(2-7);
		n2 = n2/ 2;
		n2 = Math.pow(n2, 2);
		
		double n3 = (n1 - n2);
		n3 = Math.pow(n3, 3);
		
		double n4 = Math.pow(10, 3);
		
		System.out.println("O resultado é: "+ (n3/n4));
	}
}
