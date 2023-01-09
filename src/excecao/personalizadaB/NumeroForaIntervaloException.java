package excecao.personalizadaB;

/*
 * @SuppressWarnings("serial") -> seria o processo de 
 * salvar umo bjeto java em um arquivo txt por exemplo
 * e depois você pode pegar esse texto e deserializar e 
 * transformar em um objeto de memória.
 */
@SuppressWarnings("serial") //ctrl + 1 para adicionar 
public class NumeroForaIntervaloException extends RuntimeException{

	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está fora do intervalo!" + nomeDoAtributo);
	}
}
