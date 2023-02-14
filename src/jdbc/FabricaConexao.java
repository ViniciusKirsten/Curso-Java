package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao() {
		//basicamente aqui estou trocando uma exceção checada por uma exceção não checada
		try {
			final String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCetificate=false&useSSl=true";
			final String usuario = "root";
			final String senha = "vinicius";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private static Properties getProperties() {
		Properties prop = new Properties(); 
	}
}
