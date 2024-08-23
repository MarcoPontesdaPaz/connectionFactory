package br.coppetec.view;

import java.sql.SQLException;
import java.util.List;

import br.coppetec.dao.FuncionarioDao;
import br.coppetec.modelos.pessoal.Funcionario;

public class Main {

	public static void main(String[] args) {

		FuncionarioDao dao = new FuncionarioDao();
		
		
		System.out.println("forma 1 --------------------------------------");
		
		try {
			
			List<Funcionario> funcionarios = dao.listar();
			
			for (int i = 0; i < funcionarios.size(); i++) {
				System.out.println(funcionarios.get(i).getNome());
			}			

		} catch (SQLException e) {
			System.out.println(e.getMessage());;
			
		}
		System.out.println("forma 1 Fim ----------------------------------");
		
		
		System.out.println("forma 2 --------------------------------------");
		
		try {
		
			for (Funcionario p : dao.listar()) {
				System.out.println(p.toString());
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());;
			
		}
		
		System.out.println("forma 2 Fim ----------------------------------");
	}
}
