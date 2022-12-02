package oo.composicao.umparaum;

public class Carro {
	//usando a classe carro para relação um para um.
	
	final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
		//"this" é o própio objeto atual para contruir o motor
	}
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
