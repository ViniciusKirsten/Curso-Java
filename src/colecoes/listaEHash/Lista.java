package colecoes.listaEHash;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
//								ou
//		ArrayList<Usuario> lista = new ArrayList<>();
		
		// 1º método adicionando usuario
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		// 2º método adicionando usuario
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));//aceita duplicado
		/*
		 * lista.add() --> somente usuario
		 * 
		 * nesse caso agora eu só vou poder adicionar elementos
		 * do tipo Usuario, que são as minha classe "Usuario"
		 */
		for(Usuario usuarios: lista){
			System.out.println(usuarios.nome);
			/*			ou
			 * System.out.println(usuarios.toString);
			 * 
			 * Esse método vai chamar o meu "toString"
			 * da classe principal
			 */
		}
		
		//buscar um elemento a partir de um indice
		System.out.println(lista.get(3).nome);// acessar pelo indice
		
		//REMOVENDO OBJETOS DA LISTA
		
		lista.remove(1);//removendo pelo indice
		lista.remove(new Usuario("Manu")); //removendo pelo objeto
		/*
		 * Se tiver itens duplicados, vai ser excluido somente um.
		 * 
		 * Retorno de valores quando remover um item da lista.
		 * 
		 * System.out.println(lista.remove(1)); --> removeu mas retornou o valor que estava associado
		 * System.out.println(lista.remove(new Usuario("Manu"))); --> removeu e retornou um valor booleano
		 */
		
		//VERIDICAR SE ESTÁ CONTIDO
		System.out.println("Possui o elemento: " + lista.contains(new Usuario("Lia")));
		
	}
}
