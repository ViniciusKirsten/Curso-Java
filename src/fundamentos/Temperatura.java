package fundamentos;

public class Temperatura {
	/*
	 * método 'main' é um ponto de entrada de um programa java. 
	 * O programa só vai compilar se existir um método 'main'.
	 */
	public static void main(String[] args) {
		//Fórmula: (°F - 32) * 5/9 = C°
		
		/*
		 * no java sempre que você fizer uma divisão de números inteiros 
		 * o resultado vai ser um número inteiro, quando você fizer uma 
		 * divisão de numeros reais o resultado vai ser um número real.
		 * ´
		 * por isso usei 5.0 / 9.0, para o java entender que estava usando 
		 * números reais.
		 */
		final double Y = (5.0/9.0);
		final int X = 32;
		int	fahrenheit = 30;
		
		double celsius = (fahrenheit - X) * Y;
		
		System.out.println(celsius);
		
	}
}
