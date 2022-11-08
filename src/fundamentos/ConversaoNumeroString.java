package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//FORMA 1
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
										   // ^ forma para descobrir o número de caracteres
		
		//FORMA 2
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length()); // colocando a "classe" do tipo dele antes de tudo.
		/*
		 * Integer.toString()
		 * Long.toString()
		 * Double.toString
		 * Byte.toString()
		 */
		
		//FORMA 3 (forma não recomendada)
		System.out.println(("" + num2).length());
		System.out.println(("" + num1).length());
	}
}
