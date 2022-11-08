package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String   x  = "texto";
	 // ^ classe ^ obejto 
	 	/* 
		* Quando atribuimos um valor para esse item dentro 
		* de uma classe ele começa a virar um objeto.
		*/ 
		x.toUpperCase();
		/*
	 	* por ser um objeto começa a ter atributos e 
	 	* comportamentos, como no exemplo.
	 	*/
		
		//podendo criar uma string dessa forma tbm
		String y = new String("texto");
		y.toUpperCase();
		
		/* Tipos primitivos não tem notação ponto
		 * porém os wrappers seriam uma funcionalidade 
		 * que podemos usar nos tipos primitivos.
		 *
		 * Wrappers são uma versão objeto dos tipos
		 * primitivos.
		*/
		
		//WRAPPERS
		int a = 123;
		System.out.println(a);
		
	}
}
