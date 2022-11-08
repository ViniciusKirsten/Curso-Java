package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//como executar um código no eclipse 
		//  ctrl +shift + f11
		/*
		 * Como declarar um váriavel em java
		 * 1- tipo da váriavel
		 * 2- nome da váriavel
		 * 3- atribuo um valor para a variavel
		 */

//		int raio = 3; número inteiro
		
		double raio = 3.4; // números reais , usando o padrão americano com ponto ao invés de virgula 
		
		//criando uma constante, 'final' que significa final em português
		final double Pi = 3.14159;
		//^ convenção é sempre que declarar uma constante com letras maiusculas.
		System.out.println(Pi * raio *raio);
		
		/*
		 * Tanto se eu quiser mudar o valor como no exemplo ele vai acusar um erro. 
		 * 
		 * 	Pi = 1;
		 */
	
		//podendo mudar o valor da váriavel.
		raio = 10;
		double area = Pi * raio * raio;
		
		//concatenação entre números e textos em um system.out
		System.out.println("Área = "+area);
	}
}
