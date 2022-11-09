package classe;


public class VariaveisLocais {

	String nome = "Vinicius";
	int idade = 23;
	final int x = 11; 
	/*
	 * Quando você defini uma constante o valor dela 
	 * tem que ser declarado antes que o construtor 
	 * seja rodado, ou o mais tardar declarar o valor 
	 * da constante dentro do construtor
	 */
	
	
	// INICIALIZAÇÃO POR PADRÃO
	// byte, short, int, long --> 0 | por padrão o valor será zero
	// float, double --> 0.0 | por padrão o valor será zero ponto zero
	// boolean --> false | por padrão o valor será false
	// char --> '\u0000' | por padrão vai ser o primeiro elemento da tabela unicode
	// objetos --> null |por padrão o valor será nulo
	
	/*
	 * NULL
	 * valor null significa que não aponta para 
	 * nenhum espaço de memória.
	 */
	
	VariaveisLocais(){
		/*
		 * se você tentar criar uma variavel que é local ou seja
		 * definida dentro de um método ou um construtor e voce não
		 * inicializar essa variavel, você não pode  usar essa variavel
		 */
		int a = 0; // pode ser inicializada assim 
		a = 3; 	   // ou pode ser inicializada depois da criação
		
		System.out.println(a);
		/*
		 * ma variavel locai não é inicializada por padrão. 
		 * 
		 * Uma variavel ou uma variavel que pertence a class; 
		 * em outras palavras variaveis definidas diretamente 
		 * no corpo da classe fora dos métodos são inicializadas
		 * por padrão.
		 */
		
	}
	
	
	void MostrarSobreVinicius () {
		System.out.println(nome);
		System.out.println(idade);
		double altura = 1.80; //variavel local
		/*
		 * só vai ser possivel ver essa variavel a partir dessa linha
		 * e somente dentro desse método acima da declaração não é 
		 * possivel chamar ela
		 */
		System.out.println(altura);
		System.out.println(peso);
	}
	
	
	double peso = 90.0;
	/*
	 * essa variável pode ser chamada em qualquer método de instancia
	 * pois ela perntence a instancia e não a algum método.
	 * 
	 *  obs: padrão é colocar no inicio do método
	 */
	
	
	VariaveisLocais(int idade, double peso){
		/*
		 * parametros dos contrutores só são possiveis de enxergar 
		 * dentro de seu construtor, fora do código não é possivel
		 */
		this.idade = idade;
		this.peso = peso;
		/*
		 * se não atribuir os valores que foram acrescentado na classe 
		 * que criaria uma instancia, os valores são perdidos, por isso
		 * atribuimos os valores de entrada do contrutor dentro das variaveis 
		 * de instancia no método principal
		 */
	}
}
