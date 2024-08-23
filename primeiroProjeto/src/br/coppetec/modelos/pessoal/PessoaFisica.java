package br.coppetec.modelos.pessoal;

import java.util.Calendar;

public abstract class PessoaFisica {
	
	String cpf	= null;
	String nome = null;
	String sexo	= null;
	Calendar nascimento = null;
	
	public PessoaFisica () {
	}
	
	public PessoaFisica (	String cpf
						,	String nome
						,	String sexo
						,	Calendar nascimento) {
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CPF = " + this.getCpf() + " - Nome = " + this.getNome();
	}
	
}
