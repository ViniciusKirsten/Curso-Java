package controle;

public class For3 {
	public static void main(String[] args) {
		/*
		* 
		* int i = 0;
		* for(; i < 10; i++) {
		*   	System.out.println(i);
		* }
		* System.out.println(i);
		* 
		* Caso eu queira acessar a variavel
		* depois de colocar ela no laço de 
		* repetição, tudo depende do escopo 
		* e suas restrições.
		* 
		*/
		for(int i=0 ; i<10; i++) {
			for(int j = 0; j<10;j++){
				System.out.printf("\n[%d] [%d]", i, j);
			}
			System.out.println("\n");
		}
	}
}
