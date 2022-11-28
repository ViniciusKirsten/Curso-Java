package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		//vamos ter dois valores separados por virgula
		Map<Integer, String> usuarios = new HashMap<>();
		
		/*
		 * o "Map" não tem o método "add", usa somente o "put"
		 * 
		 * put: Tanto adiciona quando não existe e substitui caso ja exista.
		 */
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		//vai retorna os valores das chaves
		System.out.println(usuarios.keySet());
		
		//vai retornar somente os valoes
		System.out.println(usuarios.values());
		
		//vai retornar as chaves e os valores
		System.out.println(usuarios.entrySet());
		
		//verifica se contain uma certa chave
		System.out.println(usuarios.containsKey(2));
		
		//verifica se contain um certo valor
		System.out.println(usuarios.containsValue("Rebeca"));
		
		//vai retornar o valor que está dentro do dois 
		System.out.println(usuarios.get(2));
		
		//removendo valores a partir da chave
		System.out.println(usuarios.remove(2));
		
		//removendo usuarios com chave e valor
		System.out.println("remove: "+usuarios.remove(1, "Gui")); //com um valor errado ele retorna falso e não remove
		System.out.println("remove: "+usuarios.remove(1, "Roberto"));// com um valor certo ele remove e retorna verdadeiro
		
		//percorrendo as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//percorrendo os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		/*
		 * Vamos percorrer a partir do "Entry", percorrendo chave e valor
		 * 
		 * Devemos escolher exatamente o [Entry - java.util.Map]
		 * 
		 * 1- colocar os mesmo valores que colocamos dentro do Map, que no 
		 * exemplo a seguir é, (Integer, String) em ambos os locais.
		 */
		for(Entry<Integer, String> registros: usuarios.entrySet()) {
			System.out.print(registros.getKey()+"-->");
			System.out.println(registros.getValue());
		}
	}
}
