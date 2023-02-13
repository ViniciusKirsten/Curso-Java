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

		System.out.print("Informer o código da pessoa: ");
		int codigo = Integer.parseInt(entrada.nextLine());
		 
		String select = "SELECT CODIGO, NOME FROM PESSOAS WHERE CODIGO = ?";
		String update = "UPDATE PESSOAS SET NOME = ? WHERE CODIGO = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é "+ p.getNome());
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		}else {
			System.out.println("Pessoa não encontrada");
		}
		
		entrada.close();
		conexao.close();
	}
}
