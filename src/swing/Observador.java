package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		
		//serve para quando clicar no "X" vai fechar a janela e parar a aplicação
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//definir o tamanho da minha janela
		janela.setSize(600,300);
		
		//definindo o layout da janela
		janela.setLayout(new FlowLayout());
		
		//centralizar a janela
		janela.setLocationRelativeTo(null); 
		//"null" pra ele centralizar na tela do computador
		//poderia centralizar a partir de outra janela.
		
		//criando o botão de clicar
		JButton botao = new JButton("Clicar!");
		
		//adicionando o botao na janela
		janela.add(botao);
		
		//O que "escuta" o evento acontecer

		//USANDO UMA CLASSE ANONIMA
		/*
		 * 	botao.addActionListener(new ActionListener() {
		 *		public void actionPerformed(ActionEvent e) {
		 *			System.out.println("Evento ocorreu!");
		 *		}
		 *	});
		 *
		 */
		
		//USANDO LAMBDA
		botao.addActionListener(e ->{
			System.out.println("Evento ocorreu!");
		});
		
		janela.setVisible(true);		
	}
}
