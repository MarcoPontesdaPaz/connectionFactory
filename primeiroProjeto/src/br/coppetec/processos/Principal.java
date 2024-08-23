package br.coppetec.processos;
import br.coppetec.modelos.pessoal.*;
import java.util.Date;
import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		
		//	classe java.util.Date
		Date data = new java.util.Date();
		System.out.println(data);
		
		//	classe Calendar
		Calendar nascimento = Calendar.getInstance();
		nascimento.set(Calendar.YEAR, 1965);
		nascimento.set(Calendar.MONTH, 1);
		nascimento.set(Calendar.DAY_OF_MONTH, 25);

		Funcionario marco = new Funcionario (	"898.405.857-20", "Marco Pontes", "M", nascimento);
	
		System.out.println("Matricula   = " 	+ marco.getMatricula());
		System.out.println("CPF         = " 	+ marco.getCpf());
		System.out.println("Nome        = " 	+ marco.getNome());
		System.out.println("Sexo        = " 	+ marco.getSexo());
		System.out.printf("Nascimento  = %2d/%02d/%4d\n"	, marco.getNascimento().get(Calendar.DAY_OF_MONTH) 
															, marco.getNascimento().get(Calendar.MONTH)
															, marco.getNascimento().get(Calendar.YEAR)) ;		
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		nascimento.set(Calendar.YEAR, 1970);
		nascimento.set(Calendar.MONTH, Calendar.MARCH);
		nascimento.set(Calendar.DAY_OF_MONTH, 18);
		
		Funcionario gisele = new Funcionario (	"123.456.789-00", "Gisele Pontes", "F", nascimento);
		
		System.out.println("Matricula   = " 	+ gisele.getMatricula());
		System.out.println("CPF         = " 	+ gisele.getCpf());
		System.out.println("Nome        = " 	+ gisele.getNome());
		System.out.println("Sexo        = " 	+ gisele.getSexo());
		System.out.printf("Nascimento  = %2d/%02d/%4d\n"	, gisele.getNascimento().get(Calendar.DAY_OF_MONTH) 
															, gisele.getNascimento().get(Calendar.MONTH)
															, gisele.getNascimento().get(Calendar.YEAR)) ;			
		
	}
}
