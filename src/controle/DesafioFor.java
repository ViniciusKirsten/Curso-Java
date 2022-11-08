package controle;

public class DesafioFor {
	public static void main(String[] args) {
		/*
		 * Versão do desafio
		 * Não pode usar o valor númerico para controlar 
		 * o laço!
		 */
		
		for(String valor = "#" ;!"######".equals(valor); valor += "#") {
			System.out.println(valor);
		}
	}
}
