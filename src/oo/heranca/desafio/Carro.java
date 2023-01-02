package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	public int delta = 5;
	
	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		this.velocidadeAtual = 0;
	}
	
	public void acelerar(){// acrescentar em 5 em 5
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;			
		}
	}
	
	public void frear(){//não pode frear com valor abaixo de zero
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
}