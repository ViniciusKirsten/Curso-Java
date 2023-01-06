package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		//para que você não pegue valores duplicados
		System.out.println("Distinct..."); 
		alunos.stream().distinct().forEach(System.out::println);;
		/* sem o equal ele pega somente o endereço de memória 
		 * ai nesse caso tive que ir até o "Aluno" e implementar 
		 * o 'equals' e o 'hashcode'
		 */
		
		System.out.println("\n Skip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)//pula dois elementos
			.limit(2)//vai limitar para pegar apenas dois elementos
			.forEach(System.out::println);;
		
			System.out.println("\n takeWhile");
			//pegue elementos enquanto acontecer determinada condição
			alunos.stream()
				.distinct()
				.takeWhile(a -> a.nota >= 7)
				.forEach(System.out::println);;
	}
}
