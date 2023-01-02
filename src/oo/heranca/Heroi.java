package oo.heranca;

public class Heroi extends Jogador{

	/*
	 * extends: Quer dizer que ele vai receber código  
	 * a partir de reuso e esse reuso ocorreu a partir do 
	 * mecanismo de herança
	 */
	
	public Heroi(int x, int y){// craindo um construtor para a classe pai 
		super(x, y); //pois a classe pai não tem o contrutor padrão
	}
	
	// sobrescrever um comportamento ou um método na classe filha
	/*
	 * nesse caso o herói vai ter uma vantagem sobre os outros oponentes
	 * pois ele ataca com 20.
	 */
	public boolean atacar(Jogador oponente){
		int deltaX =  Math.abs(x - oponente.x);
		int deltaY = Math.abs( y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}else if(deltaX == 1 && deltaY ==0) {
			oponente.vida -= 20;
			return true;
		}else {			
			return false;
		}
	}
}
