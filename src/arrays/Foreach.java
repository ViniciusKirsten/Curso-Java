package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		//"for" normal
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println(" ");
		
		//"foreach" especifico para arrays 
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
		/*
		 * toda vez que ele for repetir o laço vai colocar o valor
		 * do proximo item dentro da variavel "nota", essa variavel "nota"
		 * pode ser qualquer nome que eu quiser 
		 */
	}
}
