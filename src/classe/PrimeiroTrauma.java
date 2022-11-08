package classe;

public class PrimeiroTrauma {

	int a = 3; //não pode mexer aqui
	static int b = 4;//poderia ter usado essa forma também 
	
	public static void main(String[] args) {
		//criando uma instancia
		PrimeiroTrauma x = new PrimeiroTrauma();
		//chamando o atributo "a" apartir de uma instancia
		System.out.println(x.a);
		
		/*
		 * Mesmo estando na própia classe você só consegue 
		 * acessar o membro de instancia a partir de um método 
		 * estático se voce criar uma instancia.
		 */
		
		System.out.println(b);//forma colocando public no "b"
	}
}
