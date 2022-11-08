package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		/*
		 * Indicado não usar esse tipo de continue.
		 * Serve somente para fim de conhecimento.
		 */
		//colocando um nome no meu laço mais externo
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					//continue rotulado
					continue externo;
					
				}
				System.out.printf("%d %d ",i,j);
			}
			System.out.println();
		}
	}
}
