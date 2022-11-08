package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		//comportamento estrnho que acontece no Java
		int a = 97;
		int b = 'a';
		
		/* 
		 * Dentro da  tabela unicode cada letra vem associada 
		 * a um número, então a letra a letra 'a' é associada ao 97,
		 * então se vou fazer uma comparação mesmo sendo entre um
		 * número e um caracter, pode resultar em um booleano.
		 */
		System.out.println(a == b);
		
		System.out.println("\u0061"); //isso tambem imprime a letra 'a' 
		/*
		 * Se o número fosse '0097' não iria funcionar pois ele está em 
		 * decimal, porém se transformarmos o número '97' para hexadecimal
		 * vamos ter o número '61', então se colocarmos o '0061' como 
		 * código unicode, então teremos a letra 'a'.		 
		*/
		
		// Lembrando que toda letra tem o seu respectivo número unicode.
		
		System.out.println(3 > 4); // maior
		System.out.println(3 >= 3); // maior igual
		System.out.println(3 < 7); // menor
		System.out.println(30 <= 7); // menor igual
		System.out.println(30 != 7); // diferente
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
