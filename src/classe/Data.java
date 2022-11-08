package classe;

public class Data {
	/*
	 * Exercicio
	 * 
	 * Data
	 * criar três atributos: 
	 * - dia
	 * - mes 
	 * - ano
	 * 
	 * DataTeste 
	 * instanciar duas datas
	 */
	
	int dia;
	String mes;
	int ano;
	
	String obterDataFormatada(){
		return dia+"/"+mes+"/"+ano;
		//return String.format("%d/%d/%d", dia, mes, ano);
		// ^ --> poderia ter usado dessa forma (forma mais correta)
	}
	
	//indicado não usar dessa forma
	void imprimirDataModoNaoUsual() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	//construtor padrão
	Data(){
		dia = 01;
		mes = "janeiro";
		ano = 1970;
	}
	
	//construtor com entrada de parâmetros
	Data(int diaInicial, String mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
}
