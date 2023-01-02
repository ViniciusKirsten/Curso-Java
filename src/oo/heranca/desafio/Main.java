package oo.heranca.desafio;

public class Main {
	
	public static void main(String[] args) {
		Civic carro1 = new Civic(200); 
		Carro carro2 = new Corsa();
		/* Quando eu tenho um método com o mesmo nome
		 * tanto no mais genérico quanto no mais especifico
		 * mas a minha instancia foi criada com o método mais
		 * especifico, vai sempre ter uma preferencia pelo método
		 * mais especifico, por isso que quando usamos "acelerar"
		 * no caso do "Civic", vai ser usado o metodo que esta dentro 
		 * do "Civic".
		 */
		carro1.ligarTurbo();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro2.acelerar();
		
		System.out.println("Civic: "+ carro1.velocidadeAtual);
		System.out.println("Corsa: "+ carro2.velocidadeAtual);
		
		carro1.frear();
		carro2.frear();
		
		System.out.println("Civic: "+ carro1.velocidadeAtual);
		System.out.println("Corsa: "+ carro2.velocidadeAtual);
	}
}
