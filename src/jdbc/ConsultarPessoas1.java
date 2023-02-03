package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM PESSOAS";
		
		Statement stmt = conexao.createStatement();

		//pegando os dados do bancoi e trazendo para o java
		ResultSet resultado = stmt.executeQuery(sql); 
		
		//criando uma lista
		List<Pessoa> pessoas = new ArrayList<>();
		
		//adicionando os resultado de todo o banco de dados e colocando dentro de uma lista
		while(resultado.next()) {
			int codigo= resultado.getInt("CODIGO");
			String nome = resultado.getString("NOME");
			pessoas.add(new Pessoa(codigo, nome));
		}
		//mostando no terminal
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " --> " + p.getNome());
		}
		
		stmt.close();
		conexao.close();
	}
}
