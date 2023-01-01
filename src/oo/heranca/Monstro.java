package oo.heranca;

public class Monstro extends Jogador{

	/*
	 * nesse caso ele também vai funcionar como o 
	 * herói passando todas as informações do jogador
	 * a partir do mecanismo de herança
	 */
	
	/*
	 * Dessa forma eu não preciso reescrever o código
	 * posso apenas chamar o método da minha super classe.
	 */
	boolean atacar(Jogador oponente){
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
}
