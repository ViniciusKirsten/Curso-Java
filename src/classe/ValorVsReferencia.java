package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		//atribuição por valor (Tipo Primitivo)
		double a = 2;
		double b = a;
		a++;
		b--;
		System.out.println(a + " " + b);
		
		//atribuição por referância (Objeto)
		Data d1 = new Data(1,"abril", 2022);
		Data d2 = d1;
		d1.dia = 31;
		d2.mes = "fevereiro";
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltaDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
		
	}
	
	/* Se você passa um objeto como parametro para um método 
	 * esse objeto também é passado como referência, você não 
	 * está passando um clone do objeto mas está passando uma 
	 * referência e se dentro desse método você mexer nos dados
	 * do objeto quem passo o objeto vai perceber que houve uma 
	 * mudança 
	 * 
	 * isso por que um método estatico só consegue acessar outro método 
	 * estático, por isso o "main" só vai conseguir acessar caso o próximo 
	 * método também esteja estático.
	 * 
	 * Ou seja a partir de um método que pertence a classe voce consegue 
	 * acessar um outro método que pertence a classe, você não consegue a 
	 * partir de um método estático acessar um método de instância.
	 *
	 */
	
	//passando um objeto como parâmetro de um método
	static void voltaDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = "Janeiro";
		d.ano = 1970;
	}
			
	/*
	 * Quando você passa um primitivo como parâmetro de um método 
	 * ele vai ter o mesmo comportamento de quando você atribui em 
	 * uma nova váriavel, ele vai somente gerar uma cópia do seu valor
	 */
	//passandu um primitivo como parametro para um método
	static void alterarPrimitivo(int a) {
		a++;
	}
}
