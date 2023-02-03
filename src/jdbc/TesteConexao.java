package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException{ //essa vai ser a exceção
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCetificate=false&useSSl=true"; //Vai informar em que local eu vou acessar
		//jdbc:mysql://localhost --> local onde está o meu banco de dados
		//3306 --> porta expecifica do banco de dados
		//useSSl=true --> usar um tipo de mais forte de segurança
		//& --> separar os parametros
		//verifyServerCetificate --> não verificar o certificado do servidor 
		final String usuario = "root";
		final String senha = "vinicius";
		
		//Obs: todos os imports que vamos fazer vai ser a partir da 
		//interface "java.sql"
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha); 
		//ele vai lançar uma exceção, então teremos que tratar
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
}
