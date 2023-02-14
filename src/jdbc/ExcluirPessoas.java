package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código: ");
		int codigo = Integer.parseInt(entrada.nextLine());
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM PESSOAS WHERE CODIGO = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com suceso!");
		} else {
			System.out.println("Nada feito!");
		} 
		
		entrada.close();
		conexao.close();
	}
}