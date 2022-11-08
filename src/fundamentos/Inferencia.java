package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		/*
		 * esse tipo de váriavel vai funcionar somente 
		 * quando estiver em um método
		 * 
		 * quando fizermos isso o java vai inferir pelo 
		 * tipo de valor que você colocou, então vai 
		 * declarar um tipo da váriavel, que no exemplo 
		 * estamos usando 4.5 logo um valor double.
		 */
		var b = 4.5;
		System.out.println(b);
		
		//nesse exemplo ele vai inferir que é do tipo string
		var c = "texto";
		/*  ^ porém não posso colocar um valor decimal dentro 
		 *  dessa variavel, porque o java entende que ela é do tipo string
		 */
		
		System.out.println(c);
		
		
		double d; //delcarei a váriavel nesta linha.
		d = 123.5; //inicializei a variavel nesta linha.
		System.out.println(d); //usei a variavel
		
		/*
		 * pórem no var eu não posso usar o método acima pois na
		 * inicialização da variavel que o java consegue inferir 
		 * que váriavel é aquela
		 * 
		 * ex CERTO:
		 * var d = 123.5
		 * 
		 * ex ERRADO:
		 * var d;
		 * d = 123.5
		 */
		
		/*
		 * usando a INFERENCIA com var, posso colocar valores inteiros dentro de valores reais,
		 * porém não posso colocar valores valores reais dentro de valores inteiros 
		 * 
		 * ex CERTO:
		 * var numero = 10.5;
		 * numero = 10;
		 * 
		 * ex ERRADO: 
		 * var numero = 10
		 * numero = 10.5
		 */
	}
}
