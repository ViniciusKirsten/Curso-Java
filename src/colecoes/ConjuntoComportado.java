package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<String>();
		/*					ou
		 * Set<String> lista = new HashSet<>(); --> operador diamond
		 *
		 * quando atribuo  um valor no "Set" nao preciso necessariamente
		 * adicionar no "HashSet" 
		 * 
		 * Quando eu coloco " <String> " eu estou dizerndo
		 * que agora a minha lista é obrigatóriamente do 
		 * tipo "String"
		 * 
		 * no método sem o " <> " tudo que está dentro do meu conjunto
		 * é um objeto, mas quando eu coloco o tipo dele " <Sting> " e
		 * clicar "ctrl + espaço" só vai ter mais a sugestão de String
		 * pois agora só vai receber mais tipos Strings.
		 */
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidatos: listaAprovados) {
			System.out.println(candidatos);
		}
		
		// listaAprovados.get(1); Não é possivel acessar pelo indice 
		
		//FORMA PARA ADICIONAR SOMENTE STRING E MANTER A ORDEM DE INSERÇÃO
		TreeSet<String> listaAprovadosOrganizada = new TreeSet<>();

		listaAprovadosOrganizada.add("Ana");
		listaAprovadosOrganizada.add("Carlos");
		listaAprovadosOrganizada.add("Luca");
		listaAprovadosOrganizada.add("Pedro");
		
		for(String candidatos: listaAprovadosOrganizada) {
			System.out.println(candidatos);
		}
	}
}
