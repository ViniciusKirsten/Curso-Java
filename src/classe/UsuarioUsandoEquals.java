package classe;

public class UsuarioUsandoEquals {

	String nome;
	String email;
	
	/*
	 * esse "Object" é a classe mais generica
	 * do java, como se fosse a mais erto da 
	 * raiz
	 */
	
	public boolean equals(Object objeto) {
		/*
		 * O "objeto" seria o que você vai 
		 * colocar dentro do seu código "main"
		 * 
		 * Então o "instanceof" está vendo se 
		 * o objeto que foi passado é uma 
		 * instancia da classe Usuario, que é a
		 * classe que estamos atualmente.
		 */
		if(objeto instanceof UsuarioUsandoEquals) {
			/*
			 * também é um casting igual quando 
			 * quero converter um inteiroa para um
			 * double.
			 */
			UsuarioUsandoEquals outro = (UsuarioUsandoEquals) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			/*
			 * 						OU
			 * boolean nomeIgual = outro.nome == this.nome;
			 * boolean emailIgual = outro.email == this.email;
			 * 
			 * Boa pratica é sempre deixar com "equals".
			 */

			return nomeIgual && emailIgual;
		}else {
			return false;
		}
			
	}
}
	

