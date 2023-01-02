package oo.abstrato;

public abstract class Mamifero extends Animal{

	// Animal --> Mamifero 
	//tenho que implementar o método mover pois não foi implementado em Animal
	@Override
	public final String mover() { //não pode ser alterado por nenhum outro método
		return "Saindo do lugar";
	}
	
	public abstract String mamar();
}
