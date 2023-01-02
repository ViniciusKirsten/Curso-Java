package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	// construtor do objeto
	public Pessoa(String nome, String sobrenome,int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// dessa forma eu posso ler o atributo privado
	// Getter
	public int getIdade() {
		return idade;
	}
	
	// dessa forma eu posso alterar o atributo privado
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade > 0 && novaIdade <= 120){
			this.idade = novaIdade;
		}
	}
	
	// Criando um get com dois atributos privados
	public String getNomeCompleto() {
		return getNome() + getSobrenome();
	}

	// Criação automatica de getter e setter do Eclipse
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String toString() {
		return "Olá eu sou o "+ getNome() + " e tenho "+
				getIdade() + " anos";
	}
	
}
