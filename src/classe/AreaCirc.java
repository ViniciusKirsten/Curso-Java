package classe;

public class AreaCirc {

	double raio;
	static double pi = 3.14; // variável que pertence a classe
	
	/*
	 * final static double pi = 3.14 --> dessa forma ele vira estático
	 * ou 
	 * static final double pi = 3.14 --> dessa forma ele também vira estático
	 * 
	 * quando ele está estático não é possivel mudar o valor na classe que 
	 * vai ser criado instância
	 */
	
	
	//construtor
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	//método
	double area() {
		return pi * raio * raio;
//		return pi * Math.pow(raio , 2); --> poderia usar dessa forma também
	}
	
	//posso criar métodos com parâmetros diferentes
	static double areaDois(double raio) {
		return pi * Math.pow(raio, 2);
	}
	//quando tenho um método estático eu não preciso criar uma instância para acessar
}
