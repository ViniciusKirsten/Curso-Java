package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
	//selecionar uma pessoa pelo ID
	//alterar o nome da pessoa
	//fazer um update para o banco de dados

	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		System.out.println("Informer o código da pessoa: ");
		int codigo = entrada.nextInt();
		 
		String sql = "SELECT CODIGO, NOME FROM PESSOAS WHERE CODIGO = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
		}
		
		entrada.close();
		conexao.close();
	}
}
