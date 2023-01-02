package oo.abstrato;

public abstract class Animal {

	/*
	 * Abstract:
	 * * pode ter métodos 100% implementados;
	 * * pode ter métodos 0% implementados;
	 * * não pode ser instanciada.
	 */
	
	public String respirar() {
		return "CO2";
	}
	
	public abstract String mover();
	
	
}
