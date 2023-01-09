package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidações {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -7.0);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
			
		} catch (StringVaziaException e) {
			
			System.out.println(e.getMessage());
			
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		//OU
		/*
		 * try {
		 *	 	Aluno aluno = new Aluno("", -7.0);
		 *	 	Validar.aluno(aluno);
		 * } catch (StringVaziaException e) {
	 	 *	 	System.out.println(e.getMessage());
		 * } catch (NumeroForaIntervaloException e) {
		 *	 	System.out.println(e.getMessage());
		 * }
		 *  
		 */
		System.out.println("Fim!");
	}
}
