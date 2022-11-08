package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		//string não é um tipo primitivo. Ela é um tipo porém não primitivo.
		String s = "Bom dia X"; //string sempre com o 'S' maiusculo.
		/*
		 * essse tipo de método eu posso colocar um ponto no final e chamar outras
		 * funcionalidades.
		 */
		s.toUpperCase(); // porém ele só funciona nessa linha
		s = s.toUpperCase(); //dessa forma atribui para a variavel e fica salvo a funcionalidade
		
		//funcionalidade para substituir
		s.replace("X", "Senhora"); //funciona somente nessa linha 
		s = s.replace("X", "Senhora"); //dessa forma atribui para a variavel
		
		//serve para concatenar com outra string
		s = s.concat("!!!");
		
		System.out.println(s);
		
		//posso junto com o valor literal colocar um ponto e posso ter as mesmas funcionalidades 
		System.out.println("Mário".toUpperCase());
		//e tambem posso usar dessa forma 
		String x = "léo".toUpperCase();
		System.out.println(x);
		
		/*
		 * eu posso quebrar um sentença de código no ponto
		 * antes ou depois do ponto, como no exemplo
		 */
		String y = "bom dia X"
				.replace("X","Gui")
				.toUpperCase()
				.concat("!!!!");
		
		System.out.println(y);
		
		//TIPOS PRIMITIVOS: Não tem operador "."
	}
}
