package br.coppetec.modelos.pessoal;

import java.util.Calendar;

public class Bolsista extends PessoaFisica {

	int matricula;
	
	public Bolsista(	String cpf
					,	String nome
					,	String sexo
					,	Calendar nascimento) {
		super(cpf, nome, sexo, nascimento);
		
	}

}
