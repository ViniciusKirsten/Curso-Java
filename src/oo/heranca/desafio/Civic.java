package oo.heranca.desafio;

public class Civic extends Carro implements Esportivo , Luxo{
	
	Civic(){
		super(250);
	}
	
	Civic(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
		//alterando de forma diferente, onde somente altera a variavel da calsse pai
	}
	
	@Override
	public void ligarAr() {
		
	}
	@Override
	public void desligarAr() {
		
	}
	
	@Override
	public void ligarTurbo() {
		delta = 35;
	}
	
	@Override
	public void desligarTurbo() {
		delta = 15;
	}
	
	/*@Override --> isso serve para validação,
	 * para a ide entender que de fato você 
	 * está sobrescrevendo um método
	 * 
	 * Tradução
	 * override: sobrepor
	 */
//	@Override 
//	public void acelerar() { // Quando sobrescrever um método eu não posso diminuir o nível de visibilidade 
//		super.acelerar();    // então ele só pode ser public pois o outro método já é publico.
//	}
}
