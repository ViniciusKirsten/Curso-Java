package generics;

public class Caixa<T> {
	/*
	 * Geralmente usada somente com uma letra
	 * e somente uma letra
	 * 
	 * Quando eu crio um tipo mais genérico 
	 * quando for usar em outra class eu posso
	 * dizer qual é o tipo e trabalhar em cima 
	 * do tipo que eu defini, assim posso alterar
	 * o tipo se for criar outra instancia
	 */
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
