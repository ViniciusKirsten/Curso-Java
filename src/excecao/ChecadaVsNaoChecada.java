package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			gerarErro1();
		} catch (Exception e) {
			/* Posso colocar tanto Exception tanto
			 * RuntimeException, pois o RuntimeException
			 * herda de Exception, então posso usar o mais
			 * generico ou o mais especifico.
			 */
			System.out.println(e.getMessage());
		}
		
		/*
		 * Por ser uma exceção checada obrigatóriamente eu preciso
		 * colocar um tratamento no ponto onde estou chamando o metodo
		 * com essa exceção.
		 * 
		 * Ou tbm posso colocar o "throws Exception" dentro do main
		 * assim não precisando colocar o try/catch onde vai chamar 
		 * o método.
		 */
		try {
			gerarErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
	}
	//Exceção NÃO checada ou NÃO verificada
	static void gerarErro1() {
		//criando um erro
		throw new RuntimeException("Ocorreu um erro bem legal #01");
		//throw = lançar 
		//lançar novo erro de execução
	}	
	
	/* esse erro nunca vai ser executado pois ele nao possui o throw
	 * que lança o erro.
	 * 
	 * new RuntimeException("Ocorreu um erro bem legal #01");
	 */
	
	//Exceção checada ou verificada
	static void gerarErro2() throws Exception{
		/* Quando eu tenho um excecao checada ou verificada eu tenho 
		 * que deixar claro na assinatura do método que ela é checada
		 * ou verificada. Usabdi o "throws Exception".
		 */
		throw new Exception("Ocorreu um erro bem legal #02");
	}

}
