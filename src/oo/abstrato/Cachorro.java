package oo.abstrato;

public class Cachorro extends Mamifero{

	/*
	 * Animal --> Mamifero --> Cachorro
	 * 
	 *tenho que implementar o método mamar pois ele não foi 
	 *implementado em mamifero
	 */
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
