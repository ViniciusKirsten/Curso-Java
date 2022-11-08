package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7; // = false
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		System.out.println(condicao1 && !condicao2);
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true); //aviso de código morto
//		System.out.println(false && false); //aviso de código morto
		/*
		 * Esse aviso de código morto aparece pois como o false 
		 * está na frente de uma conparação && sempre vai dar 
		 * false, então o código nunca vai chegar até a segunda 
		 * comparação.
		 */
		System.out.println("\nTabela verdade OU (OR)");
//		System.out.println(true || true); //aviso de código morto
//		System.out.println(true || false); //aviso de código morto
		System.out.println(false || true); 
		System.out.println(false || false);
		/*
		 * código morto pois usando o "or" na frente sempre vai ser 
		 * verdadeiro e nunca vai chegar na segunda comparação.
		 */
		System.out.println("\nTabela verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true); 
		System.out.println(true ^ false);
		System.out.println(false ^ true); 
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true); 
		System.out.println(!false);
	}
}
