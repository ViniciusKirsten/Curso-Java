package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		//modo implementado no java 13
		String sql = """
				CREATE TABLE IF NOT EXISTS PESSOAS(
				CODIGO INT AUTO_INCREMENT PRIMARY KEY,
				NOME VARCHAR(80) NOT NULL
				)	
				""";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");
		conexao.close();
	}
}
