package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		
		// OBS: Todas essa funções são terminadoras
		System.out.println(alunos.stream().allMatch(aprovados));
		/* ele vai pergunta se TODOS os alunos estão aprovados
		 * e retornar um resultado booleano.
		 */
		System.out.println(alunos.stream().anyMatch(aprovados));
		/* ele vai perguntar se ALGUM dos alunos estão aprovados 
		 * e retornar um resultado booleano.
		 */
		System.out.println(alunos.stream().noneMatch(aprovados));
		/* ele vai perguntar se NENHUM foi aprovado 
		 * e retornar um resultado booleano.
		 */
	}
}
