package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//NÃO permite: int --> Double 
		//int do tipo primitivo para double do tipo classe
		
		/*
		 * BinaryOperator<Double> --> retirado da documentação
		 * onde ele coleta dois valores e retorna um valor do mesmo
		 * tipo. 
		 * 
		 * obs: o tipo só é suportado com tipos de classes por isso Double
		 * com a letra 'd' maiuscula.
		 * 
		 * [retirado da documentação do java]-> onde tem mais tipos como 
		 * esse. 
		 */
		BinaryOperator<Double> soma = (x, y) -> { 
			return x + y;
		};
		System.out.println(soma.apply(2.0, 3.0));
		
		soma = (x, y) -> x*y;
		System.out.println(soma.apply(2.0, 3.0));
	
	}	
}
