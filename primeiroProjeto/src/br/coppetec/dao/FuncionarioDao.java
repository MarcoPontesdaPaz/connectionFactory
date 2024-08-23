package br.coppetec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import java.sql.SQLException;

import br.coppetec.modelos.pessoal.Funcionario;

public class FuncionarioDao {
	
	
	public List<Funcionario> listar() throws SQLException
	{
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		Connection con = null;	
		PreparedStatement smt = null;
		ResultSet rs = null;

		try {
			
			con = new ConnectionFactory().getConnection();	 

			smt = con.prepareStatement("select * from clt_Funcionario");
			
			rs = smt.executeQuery();
			
			while (rs.next()) {			
				
				Funcionario func = new Funcionario();
				
				func.setNome(rs.getString("Nome"));
				funcionarios.add(func);
			}		

		} catch (SQLException e) {
			
		} finally {
			
			if (rs != null) {rs.close();}
			
			if (smt != null) {smt.close();}
			
			if (con != null) {con.close();}
			
		}

		return funcionarios;
	}
}