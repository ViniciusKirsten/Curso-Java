package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		//coloco o código que pode gerar um erro 
		try {
			imprimirNomeAluno(a1);			
		}catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento "
					+ "de imprimir o nome do usuário");
		}
		/*
		 * assim que ocorrer o erro ele vai retornar o que está detsro
		 * do catch e vai continuar executando o código.
		 */
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException excecao) {
			System.out.println("Ocorreu o erro: "+ excecao.getMessage());
		}
		System.out.println("Fim :)");
		
		/* Quando você não colocar nada dentro do catch de forma que vai 
		 * ultilizar somente por formalidade, o ideal é sempre logar 
		 * dentro de um arquivo. Que seria colocar dentro de um arquvio texto
		 * todo o erro gerado e dados sobre aquele erro.
		 */
	}
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
