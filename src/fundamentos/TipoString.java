package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(0)); 
		//'.charAt()' mostra o caracter que tem naquele indice apontado dentro dos parenteses
		
		String s = "Boa tarde";
		/*
		 *  String é um objeto imutavel voce nunca vai conseguir 
		 *  mudar o valor inicial que vc atribui a String
		 *  
		 *  ex:
		 *  String s = "Boa tarde";
		 *  s = s.toUpperCase();
		 *  
		 *  sempre vai ocorrer uma subistituição desse valor.
		*/
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		/*
		 * essa função 'inicia com', porém essa palavra 
		 * vai retornar somente com verdadeiro ou falso 
		 * 'true' ou 'false'.
		 * Se a palavra iniciar com uma letra diferente 
		 * que nesse caso a letra 'b' começar minuscula 
		 * o valor vai retornar falso.
		 */
		System.out.println(s.startsWith("Boa"));//essa função 'inicia com' **verdadeiro**
		System.out.println(s.startsWith("boa")); //**falso**
		
		/*
		 * nesse caso ela vai retornar como verdadeiro, pois 
		 * transformei todas as letras em minuculas com 
		 * 'toLowerCase' antes de fazer a comparação.
		 */
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		System.out.println(s.length());//para saber quantos caracters tem a String
							// ^ retornando um valor inteiro
		
		System.out.println(s.endsWith("dia"));//'termina com' funciona igual a 'startsWith'
							// ^ retonar um valor verdadeiro ou falso
		
		System.out.println(s.equals("boa tarde"));//comparacção com igualdade
							// ^ retorna um valor verdadeiro ou falso
		
		System.out.println(s.equalsIgnoreCase("boa tarde"));//comparacção com igualdade
		/*retornando tambem um valor verdadeiro ou falso 
		 * mas agora ignorando se tem letras maiusculas, compararndo somente os caracter,
		 * se caracteres forem iguais o resultado retorna verdadeiro
		*/
		
		var nome = "Vinicius";
		var sobrenome = "Mendonça";
		var idade = 23;
		var salario = 1280.905151;
		
		//forma convencional usando o 'println'
		System.out.println("\nNome: " + nome +"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalario: "+salario+"\n\n   ");
		
		//forma simplificada usando o 'printf'
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f",nome, sobrenome, idade, salario);
		/*
		 * com o '%' eu chamo a variavel por ordem como declarou as variaveis.
		 * 
		 * '%s' chama a variavel tipo string.
		 * '%d' chama a variavel tipo int.
		 * '%f' chama a variavel tipo double.
		 * '%.2f' o '.2' para quantas casas decimais quero mostrar.
		 */
		
		//usando o '.format' posso usar a mesma forma que uso dentro do 'printf'
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f",nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Uma frase qualquer".contains("qual"));//dentro da string tem a palavra 'qual', retorna verdadeiro ou falso
		System.out.println("Uma frase qualquer".indexOf("qual"));//retorna um inteiro, em qual casa começa a palavra
		System.out.println("Uma frase qualquer".substring(6));//começar a partir do sexto caracter
		System.out.println("Uma frase qualquer".substring(6, 8));//começar a partir do sexto caracter e vai até o oitavo 
														  // ^ o oitavo não entra junto no resultado
		
		}
}
