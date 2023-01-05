package streams;

public class Media {

	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) {
		this.total += valor;
		this.quantidade++;
		return this;
	}
	
	public double getValor() {
		return total/quantidade;
	}
	
	public Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.quantidade + m2.quantidade;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
}
