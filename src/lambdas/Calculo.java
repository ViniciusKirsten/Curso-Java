package lambdas;

@FunctionalInterface
/*
 * @FunctionalInterface --> não preciso usar essa notação
 * mas ela deixa explicito que estamos usando essa interface
 * no contexto de lambda.
 * Ela gera um erro caso você implementar mais um método.
 */
public interface Calculo {

	double executar(double a, double b);
	/* Uma interface funcional só pode ter um unico método abstrato,
	 * por isso que usamos a notação @FunctionalInterface.
	 */
	
	//Métodos dos tipo default podemos usar na nossa interface funcional.
	default String legal() {
		return "legal";
	}
	
	//metodos do tipo static também podemos usar na interface funcional.
	static String muitoLegal() {
		return "Muito legal!";
	}
}
