package excecao;

public class Causa {

	/*
	 * Uma exceção pode gerar outra exceção 
	 * 
	 * ex: quando for cadastrar algo dentro do banco e 
	 * nao tenha internet, logo isso vai causar um exceção
	 * assim chamando outra exceção pois nada foi cadastrado.
	 */
	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está nullo");
		}
		System.out.println(aluno.nome);
	}
}
