package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		/*
		 * neste caso nós temos um problema na precedencia, como o
		 * "a" está com o incremento na frente o compilador entende
		 * que está com mais pressa, no caso do "b" o incremento está
		 * depois, mostrando para o compilador que está com menos pressa
		 * para executar. Então o compilador entender faz o incremento no 
		 * "a" e depois faz a comparação ente "a" e "b", somente depois de
		 * tudo isso que ele diminui o valor no "b".
		 */
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
