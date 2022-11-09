package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos: ");
		int qtdeAlunos = entrada.nextInt();
		System.out.print("Quantos notas por alunos: ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDeAlunos = new double[qtdeAlunos] [qtdeNotas];
		
		double total =0;
		for (int i = 0; i < notasDeAlunos.length; i++) {
			for (int j = 0; j < notasDeAlunos[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d", (i+1), (j+1));
				notasDeAlunos[i][j] = entrada.nextDouble();
				total += notasDeAlunos[i][j];
			}
		}
		/*
		 * "i" --> representa as notas
		 * "j" --> representa os alunos
		 * 
		 * Usando um laço dentro do outro, o primeiro "for" vai 
		 * percorrer todos os alunos e cada aluno vai ter um 
		 * array com suas notasm, então o segundo "for" vai percorrer
		 * todas notas de cada aluno.
		 * 
		 *  ex:
		 *  
		 *  [] [] [] [] --> linha
		 *  [] [] [] []
		 *  [] [] [] []
		 *  [] [] [] []
		 *  
		 *  ^
		 *  |
		 *  coluna
		 *  
		 *  aluno 1 nota 1 --> [0][0]
		 *  aluno 1 nota 2 --> [0][1]
		 *  ...
		 */
		
		double mediaTurma = total / (qtdeAlunos * qtdeNotas);
		System.out.println("A média da turma é: "+ mediaTurma);
		
		for(double[] notasDoAluno : notasDeAlunos) {
			/*
			 * criando dessa forma cada vez que eu estiver percorrendo 
			 * o for mais externo, cada um dos elementos vai ser um 
			 * array de double.
			 */
			System.out.println(Arrays.toString(notasDoAluno));			
		}
		entrada.close();
	}
}
