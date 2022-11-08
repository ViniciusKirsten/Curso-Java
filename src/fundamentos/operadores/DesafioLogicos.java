package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F).
		// Trabalho na quinta (V ou F).
		
		//32 uma 50 duas sorvete todo mundo 
		//sem trabalho sem nada
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean tv50 = trabalho1 && trabalho2;
		System.out.println("***Famiília***");
		System.out.println("\nTomou sorvete: "+ (trabalho1 || trabalho2));
		System.out.println("\nEstá saudável: "+ !(trabalho1 || trabalho2));
		System.out.println("\nComprou a TV de 32\" : " + tv32);
		System.out.println("\nComprou a TV de 50\" : " + tv50);
	}
}
