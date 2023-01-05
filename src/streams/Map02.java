package streams;

import java.util.function.UnaryOperator;

public class Map02 {

	//Criando um construtor privado, assim essa classe não pode ser instanciada.
	private Map02(){
	
	}
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	public final static UnaryOperator<String> grito = n -> n.toUpperCase() + "!!! ";
}
