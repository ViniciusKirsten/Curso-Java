package fundamentos;

//importando ela para aqui
import java.util.Date;

/*
 * Posso importar ele clicando na opção 
 * ao lado que sugere algum tipo de importação 
 * ou até escrevendo dentro do meu código
 */
public class Import {
	
	public static void main(String[] args) {
		/*
		 * nem tudo vai estar a disposição a todo momento 
		 * somente algumas funcionalidades como os tipos primitivos
		 * algumas funçãoes como o System.out.println()...
		 * E algumas funçãos você deve impostar para funcionar no 
		 * seu código
		 */
		
		java.lang.String b= "Boa tarde!"; //esse é o caminho completo da string dentro do java
		java.lang.System.out.println(b);
		
		/*
		 * porém não preciso colocar o 'java.lang' na frente das coisas po que por padrão 
		 * tudo que está dentro de 'java.lang' que é o pacote mais basico da linguagem java
		 * está disponivel em todas as suas classes 
		 */
		
		String s = "Bom dia!";
		System.out.println(s);
		
		
		/*
		 * O java por pafrão não vem com todas as funções que ele 
		 * tem associado, dessa forma algumas funcionalidades devemos 
		 * chamar para que ele posso funcionar normalmente no nosso código- 
		 */
		Date d = new Date();
		System.out.println(d);
		
		
		//JButton botao = new JButton();
	}
}
