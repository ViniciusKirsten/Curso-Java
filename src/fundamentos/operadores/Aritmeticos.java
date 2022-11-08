package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);//resultado vai ser dois.
		//na divisão de inteiros o resultado vai sempre ser um inteiro.
		
		System.out.println(a / (double) b );// usando o casting para mostrar um valor real.
		
		System.out.println(8 % 3); //resto da divisão
		System.out.println(a % b); //resto da divisão
		
		System.out.println(x = y - a * b); //ordem de precedencia. 
	}
}
