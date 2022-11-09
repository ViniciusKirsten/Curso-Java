package classe.desafioModulo;

public class Pessoa {
	/*
	 * - nome da pessoa
	 * - peso da pessoa
	 * 
	 *  método comer
	 * - receber como parametro um objeto da clase comida
	 * 
	 * quando a pessoa comer a comida voce vai pegar o peso da 
	 * comida e acrescentar dentro do peso da pessoa 
	 */
	
	String nome;
	double peso;
	
	void Comer(double comida){
		peso += comida;
	}
	
}
