package oo.composicao.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	String nome;
	//criando a relação entre muitos alunos para muitos cursos
	final List<Aluno> alunos = new ArrayList<>(); //Lista Constante
	/*
	 * Lista Constante 
	 * 
	 * Usando como exemplo a variavel alunos, eu não pegar a variável
	 * cursos e apontar para outro endereço de memória.
	 * 
	 * porém o conteúdo da lista continua sendo um conteúdo variável
	 * adicionando elementos, retirando elementos, limpando a lista...
	 */
	
	//criando um construtor
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		
		//adicionando o aluno dentro do ArrayList "alunos"
		this.alunos.add(aluno);
		
		//relação bidirecional
		aluno.cursos.add(this);
	}
}
