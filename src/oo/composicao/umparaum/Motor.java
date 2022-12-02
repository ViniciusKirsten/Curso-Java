package oo.composicao.umparaum;

public class Motor {
	//Usando a classe motor como relação um para um
	
	final Carro carro;
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	//na construção forçar para receber um carro como parametro
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
			//fazer um casting e arredondar o valor.
			
		}
		
	}
}
