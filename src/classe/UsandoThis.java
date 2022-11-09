package classe;

public class UsandoThis {
	
		int dia;
		String mes;
		int ano;
		
		UsandoThis() {
			//chamando outro construtor
			this(1, "janeiro",1970);//usando o this como método, significa que está chamando um construtor
			/*
			 * mesma coisa que chamar outro construtor dentro da classe
			 * ou seja, o que vai definir qual construtor você está chamando
			 * é a quantidade de parâmetros 
			 * 
			 * obs: não pode chamar o construtor que voce chamou com o método this, deve usar
			 * somente um e contruir o objeto até o final.
			 */
		}

		
		String obterDataFormatada(){ //método que pertence a instancia
			/*
			 * método que pertence a instancia, também posso ter acesso 
			 * a instancia atual a intancia no qual esse método pertence
			 * assim como o valor do "dia" o valor do "ano" pertencem a uma
			 * instância, por que são váriaveis de instancia o método 
			 * "obterDataFormatada" e "imprimirDataModoNaoUsual" são métodos 
			 * que pertencem também a instancia. Isso tudo por que não são métodos
			 * estáticos.
			 */
			String formato ="%d/%d/%d"; //variável local
			return String.format(formato, dia, mes, ano);		
		}
		
		void imprimirDataFormatada() {
			System.out.printf(this.obterDataFormatada()); //usando o this para chamar um método
		}
		

		UsandoThis(int dia, String mesInicial, int ano){
			this.dia = dia; //uso o "this" para referencia o objeto que esta sendo criado naquele momento.
			/*
			 * Uso o "this" pois se eu colocasse "dia = dia" o valor
			 * seria o mesmo, pois eu estária atribuindo o valor da variavel 
			 * dentro da mesma variavel
			 */
			this.mes = mesInicial; //posso usar mesmo com o nome diferente
			this.ano = ano;
		}
		
		static void teste() {
			//this.dia = 3; --> não vale pois o método está como estático
			
			/*
			 * pq um método estático existe associado a classe e o this é
			 * uma das instancias da classe
			 */
		}
}

