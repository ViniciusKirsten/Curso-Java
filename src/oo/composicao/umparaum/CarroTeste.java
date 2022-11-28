package oo.composicao.umparaum;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println("O carro está ligado: " + c1.estaLigado());
		c1.ligar();
		System.out.println("\nLigando...\n");
		System.out.println("O carro está ligado: " + c1.estaLigado());
		System.out.println("Quantidade de giros: "+ c1.motor.giros()+"rpm");
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("Quantidade de giros: "+ c1.motor.giros()+"rpm");
		
		c1.frear();
		c1.frear();
		c1.frear();
		
		//Faltou Encapsulamento!!!
		//c1.motor.fatorInjecao = -30;
		
		System.out.println("Quantidade de giros: "+ c1.motor.giros()+"rpm");
		
		//posso fazer isso por que existe uma relação bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());
		//não preciso fazer tudo isso, somente mostrando que é possivel por ser uma
		//relação bidirecional 
	}
}
