package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();

		String sql = ""
				+ "INSERT INTO PESSOAS(NOME)"
				+ "VALUES(?)";
		/*
		 * Não coloco diretamente um o nome no comando e mando executar, pois 
		 * dependendo do que o usuário digitar como entrada ele pode gerar um
		 * comando que pode modificar dados da tabela, por isso usamos o "PreparedStatement"
		 */
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		//passando o dado que vai estar no "?" dentro do meu sql
		stmt.setString(1, nome);
		/* Nesse caso eu somente tenho um ponto 
		 * entao eu seleciono ele digitando o número e 
		 * depois o dado que vou registrar.
		 */
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}
}
