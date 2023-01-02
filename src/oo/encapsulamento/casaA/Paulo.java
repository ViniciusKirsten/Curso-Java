package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {		
		//System.out.println(esposa.segredo); não consigo ver pois é algo privado
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todoSabem);
	}
}
