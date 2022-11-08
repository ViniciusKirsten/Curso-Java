package classe;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//usando o construtor padrão
		Data data1 = new Data();
		System.out.print("digite o dia: ");
		data1.dia = Integer.parseInt(entrada.nextLine());
		System.out.print("digite o mês: ");
		data1.mes = entrada.nextLine();
		System.out.print("digite o ano: ");
		data1.ano = Integer.parseInt(entrada.nextLine());
		
		System.out.println("----------------------------------");
		
		//usando o construtor com entrada de parâmetros
		Data data2 = new Data(14, "abril", 2002);
//		System.out.print("digite o dia: ");
//		data2.dia = Integer.parseInt(entrada.nextLine());
//		System.out.print("digite o mês: ");
//		data2.mes = entrada.nextLine();
//		System.out.print("digite o ano: ");
//		data2.ano = Integer.parseInt(entrada.nextLine());
		
		System.out.printf("\nData 1 = %s", data1.obterDataFormatada()); //Usando o método que foi criado em "Data".
		System.out.printf("\nData 2 = %d/%s/%d",data2.dia, data2.mes, data2.ano); //Usando a forma antiga.
		
		entrada.close();
	}
}
