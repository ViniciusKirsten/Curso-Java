package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	/* Ana mae = new Ana();
	 * não preciso disso pois tudo que seraá usando
	 * vai ser a partir de hernaça e não composição.
	 */
	
	void testeAcessos() {		
		//System.out.println(mae.segredo); //não consigo ver pois é algo privado
		//System.out.println(mae.facoDentroDeCasa); //pois não estão no mesmo pacote
		System.out.println(formaDeFalar);//pois recebeu por herança
		System.out.println(todoSabem);//pois recebeu por herança
	}
}
