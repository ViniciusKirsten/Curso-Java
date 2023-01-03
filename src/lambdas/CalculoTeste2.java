package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo soma = (x, y) -> { //seria uma "função" dentro do java.
			return x + y;
		};
		//Calculo soma = (x, y) -> {return x + y;}; //poderia ser dessa forma tambem.
		
		
		soma = (x, y) -> x * y; //funcao lambda.
		/* quando você não coloca as chaves automaticamente 
		 * aquilo que você colocou vai ser retornado.
		 */
		
		System.out.println(soma.executar(2, 3)); //executar vem da minha interface.
		System.out.println(soma.legal()); //default
		System.out.println(Calculo.muitoLegal()); //static
	}	
}
