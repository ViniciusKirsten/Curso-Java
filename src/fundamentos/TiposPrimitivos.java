package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informação do funcionario
		
		// TIPOS NUMÉRICOS INTEIROS
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		/*
		 * Qunado o número for muito grande posso 
		 * usar o underline para ajudar na leitura
		 * 
		 *  Quando vou usar um número maior que o 
		 *  permitido pelo inteiro, devo apontar 
		 *  com 'L' maiuscula ou 'l' minuscula, 
		 *  mostando para o java que esse número 
		 *  se trata de um long.
		 */
		long pontosAcumulados = 3_234_845_223L;
		
		
		
		// TIPOS NUMÉRICOS REAIS
		float salario = 11_445.44F;
		/*
		 * ex: 
		 * 
		 * float salario = 11_445.44;
		 * 
		 * Se apontar o número dessa formar sem o "L" 
		 * ao lado, o java entende que você está 
		 * querendo colocar um double dentro de um 
		 * float, pois o número literal que o java vai
		 * ler é double, ele vai achar que vc quer colocar
		 * um número maior que o float suporta, mesmo o 
		 * número não sendo menor.
		 * 
		 */ 
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//TIPOS BOOLEANO
		boolean estaDeFerias = false; // ou 'true'
		
		//TIPO CARACTERE
		char status = 'A'; 
		
		//usando as váriaveis 
		System.out.println("dias de empresa: "+ (anosDeEmpresa * 365));
		System.out.println("número de viagens: "+ (numeroDeVoos / 2));
		System.out.println("pontos por real: "+ (pontosAcumulados / vendasAcumuladas));
		System.out.println(id+" ganha: "+salario);
		System.out.println("Férias: "+ estaDeFerias);
		System.out.println("Status: "+status);
	}
}
