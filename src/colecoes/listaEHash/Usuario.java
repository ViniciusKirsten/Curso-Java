package colecoes.listaEHash;

import java.util.Objects;

public class Usuario {

	String nome;
	
	//adicionando um construtor
	Usuario(String nome){
		this.nome = nome;
	}
	
	/*
	 * usa esse método para toda vez que chamar o objeto criado 
	 * a partir do usuario, somente o objeto, ele vai retornar 
	 * a String que esta dentro do método "ToString"
	*/
	public String toString() {
		return "meu nome é" + this.nome + ".";
	}
	
	//ADICIONANDO O HASHCODE E EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
}
