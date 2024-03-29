package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
//		Caso eu for usar o @FunctionalInterface no ObservadorChegadaAniversariante
		porteiro.resgistrarObservador(e -> {
			System.out.println("Surpresa via lambda!!!");
			System.out.println("Ocorreu em: "+ e.getMomento());
			});
		porteiro.resgistrarObservador(namorada);;
		porteiro.monitorar();
	}
}
