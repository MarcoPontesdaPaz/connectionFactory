package br.coppetec.modelos.pessoal;

import java.util.Calendar;

public class Funcionario extends PessoaFisica {

	int cargo = 0;
	static int matricula = 0;

	public Funcionario() {

	}
	
	public Funcionario(		String cpf
						, 	String nome
						,	String sexo
						,	Calendar nascimento) {
	
		super(cpf, nome, sexo, nascimento);
		this.matricula ++;
	}	
	
	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}
}
