package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro","Amoedo", 30);
		
		//Com atributos nos podemos alterar ou ler o atributo
		
		p1.setIdade(230); //alterar
		
		System.out.println(p1.getIdade()); //ler
		System.out.println(p1.toString()); //toString
		
	}
}
