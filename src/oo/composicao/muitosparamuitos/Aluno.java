package oo.composicao.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	//criando a relação entre muitos cursos para muitos alunos
	final List<Curso> cursos = new ArrayList<>(); //Lista Constante
	/*
	 * Lista Constante 
	 * 
	 * Usando como exemplo a variável cursos, eu não pegar a variável
	 * cursos e apontar para outro endereço de memória.
	 * 
	 * porém o conteúdo da lista continua sendo um conteúdo variável
	 * adicionando elementos, retirando elementos, limpando a lista...
	 */
	
	//Criando um construtor
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		
		//adicionando dentro do meu ArrayList "cursos"
		this.cursos.add(curso);
		
		//relação bidirecional
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	//esse método é usando sempre que você quiser mudar um objeto para um formato String
	public String toString() {
		return nome;
	}
}
