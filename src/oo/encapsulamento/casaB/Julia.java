package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	
	void testeAcessos() {		
		//System.out.println(sogra.segredo); não consigo ver pois é algo privado
		//System.out.println(sogra.facoDentroDeCasa); //não estão no mesmo pacote
		//System.out.println(sogra.formaDeFalar); //não herda nada
		System.out.println(sogra.todoSabem);
	}
}
