package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];//delcarando um array 
		/*
		 * 				ou
		 * double notasAlunoA[] = new double[3];
		 * 				ou
		 * double []notasAlunoA = new double[3];
		 * 				ou
		 * double [] notasAlunoA = new double[3];
		 *
		 * Posso também declarar os arrays dessa forma 
		 * com o colchetes antes e ou depois do nome.
		 */
		
		//essa forma eu crio um arry com valores e casas predefinido
		double[] notasAlunoB = {6.9,8.9,5.5,10};  
		
		System.out.println(Arrays.toString(notasAlunoA)); //imprimindo um array
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		//System.out.println(notasAlunoA); --> dessa forma ele não vai mostar os valores do array
		System.out.println(Arrays.toString(notasAlunoA)); //forma mais interresante de imprimir um array;
		System.out.println("Primeira nota do aluno "+notasAlunoA[0]); 
		System.out.println("Ultima nota do aluno "+notasAlunoA[notasAlunoA.length - 1]); 
		//System.out.println(notasAlunoA[4]); --> erro pq tentou acessar um elemento que está fora dos limites do array
		
		double total = 0;
		// ".length" ele sabe quantos elementos tem um array e então percorre o array inteiro
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println("média do alunon A: " + (total/notasAlunoA.length));
		
		double total2 = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			total2 += notasAlunoB[i];
		}
		System.out.println("média do aluno B: " + (total2/notasAlunoB.length));
	}
}
