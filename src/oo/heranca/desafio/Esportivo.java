package oo.heranca.desafio;

public interface Esportivo {

	/*
	 * uma interface tem métodos e esses métodos não 
	 * podem ter corpo.
	 * 
	 * Quando o interface é associado dentro de uma classe
	 * necessariamente tenho que criar os métodos gerados no 
	 * interface e crialos dentro da classe
	 * 
	 * posso ter diversar interfaces vinculadas a uma classe
	 * 
	 * o método é sempre public e abstract
	 * 
	 * posso usar o default, então não será OBRIGATÓRIO implementar na minha classe
	 */
	
	void ligarTurbo();
	void desligarTurbo();
	
	//colocando um "corpo" dentro de um interface
	default int nivelDoTurbo() {
		return 1;
	}
}
