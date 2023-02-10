package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException{
		//conexão com o banco de dados
		Connection conexao = FabricaConexao.getConexao();
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Procure o nome: ");
		String valor = entrada.nextLine();
		
		//comando do meu SQL
		String sql = "SELECT * FROM PESSOAS WHERE NOME LIKE ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor +"%");//sempre colocar os simbolos aqui e não no comando SQL
		ResultSet resultado = stmt.executeQuery(); //pegando os dados do banco e trazendo para o java
		
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
		conexao.close();
		stmt.close();
		entrada.close();
	}
}
