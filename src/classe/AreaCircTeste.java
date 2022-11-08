package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
	AreaCirc a1 = new AreaCirc(10); // atribui o valor para "area" que está na classe "AreaCirc".
	AreaCirc a2 = new AreaCirc(5);
	
	/*
	 * ISSO TUDO SE O VALOR NÃO ESTIVER COMO ESTÁTICO E CONSTANTE
	 * OBS: não faz sentido querer mudar um valor se já foi declarado
	 * para não alterar nas demis clases.
	 *  
	 * Exemplo:
	 * Se eu quiser mudar o Pi que está estatico na classe "AreaCirc",
	 * dentro da minha classe "AreaCircTeste" depois de ter criado a 
	 * minha instância.
	 * 
	 * a1.pi = 3;
	 * a2 pi = 3.1415;
	 * 
	 * usando esses dois métodos são de forma incorreta pois o Pi vai
	 * ser mudado em toda classe e não somente na instância que você 
	 * deseja.
	 * 
	 * Caso queira alterar esse valor que foi criado como estático a forma
	 * correta de criar esse objeto seria como o exemplo:
	 * 
	 * AreeaCirc.pi = 3.1415
	 * 
	 * Dessa forma ele continua mudando em toda a classe porém da forma correta
	 */
	
	System.out.println(a1.area()); //chamei o método "area" que está na classe "AreaCirc".
	System.out.println(a2.area()); //chamei o método "area" que está na classe "AreaCirc".
	
	/*
	 * por ter usado o método como estático eu não preciso criar uma instância para 
	 * acessar ele, somente chamando pela classe e com notação ponto.
	 */
	System.out.println(AreaCirc.areaDois(100));
	
	}
}
