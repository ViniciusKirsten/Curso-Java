package classe;

public class Equals {

	public static void main(String[] args) {
		UsuarioUsandoEquals u1 = new UsuarioUsandoEquals();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		UsuarioUsandoEquals u2 = new UsuarioUsandoEquals();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		/*
		 * CASO O EQUAL NÃO ESTIVER MODIFICADO
		 * 
		 * esse resultado vai dar falso, pois
		 * são dois objetos destintos na memória,
		 * ou seja ele está comparando os endereços
		 * de memória.
		 */
		System.out.println(u1.equals(u2));
		/*
		 * CASO O EQUAL NÃO ESTIVER MODIFICADO
		 * por padrão o equals vai fazer exatamente a 
		 * mesma coisa que o "==".
		 */
		
		/*
		 * System.out.println(u1 == u1);
		 * System.out.println(u1.equals(u1));
		 * 
		 * esses dois são iguais por que estão sendo 
		 * direcionados para o mesmo endereço de memória.
		 */
		
		
	}
}
