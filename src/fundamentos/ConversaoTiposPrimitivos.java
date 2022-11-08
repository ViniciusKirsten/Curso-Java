package fundamentos;


public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		double a = 1; //tipo de conversão implicita
		System.out.println(a);
		
		float b = (float) 1.123456789;// tipo de conversão explicita (CAST)
		System.out.println(b);
		/*
		 * quando quiser fazer um tipo de conversão explícita, deve colocar 
		 * o tipo que vai ser convertido entre parentes antes do valor que vai 
		 * querer associar, como no exemplo a seguir.
		 * 
		 * tipo_primitivo_novo = (tipo_primitivo_converter) valor_convertido;
		 * 								ou
		 * float b = (float) 1.123456789;
		 * 
		 * nesse exmplo: 
		 * 
		 * float b = (float) 1.123456789;
		 * 
		 * perde-se informação mas o java já está ciente disso e vai converter 
		 * mesmo assim.
		 */
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(c + " --> " + d);
		/*
		 * nesse exemplo a varíavel 'c' cabe dentro do byte
		 * porém como o compilador olha somente a conversão tipos e
		 * não a conversão de valores, ele vai acusar um erro se você
		 * mão converter de forma explícita.
		 */
		
		int e = 130;
		byte f = (byte) e;
		System.out.println(e + " --> " + f);// tipo de conversão explicita (CAST)
		/*
		 * Nesse caso o valor vai ser incorreto pois o 130
		 * não cabe dentro de um byte então ele vai fazer a 
		 * conversão mas mesmo assim porém vai mostrar um valor 
		 * incorreto.
		 */
		
		double g = 1.999999;
		int h = (int) g;
		System.out.println(h);// tipo de conversão explicita (CAST)
	}
}
