package br.coppetec.processos;
import br.coppetec.modelos.pessoal.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * consultar em https://www.dio.me/articles/trabalhando-com-datas-em-java
 */

public class PrincipalTestaData {
	
	public static void main(String[] args) {
	
		// classe java.util.Date
		Date data = new java.util.Date();
		System.out.println(data);
		
		//	classe Calendar
		Calendar dataCallendar= Calendar.getInstance();
		System.out.println(dataCallendar.getTime());
		System.out.println(dataCallendar.getTimeZone());
		System.out.println(dataCallendar.get(Calendar.YEAR));
		System.out.println(dataCallendar.get(Calendar.MONTH));
		System.out.println(dataCallendar.get(Calendar.DAY_OF_MONTH));
		//Funcionario pf as new Funcionario (	"898.405.857-20", "Marco Pontes", "M", new Date(), 1);	
		
		
		//calendarAGORA ();
		
		//calendarManipulacao ();
		
		//imprimindoDataEmFormatosDiferentes();
		
		simpleDateFormat();
		
	}
	
	public static void calendarAGORA () {
		
		Calendar agora =  Calendar.getInstance();
        System.out.printf("\n\ncalendarAGORA: " + agora);	
	}
	
	public static void calendarManipulacao() {
	
		System.out.printf("\n\ncalendarManipulacao():\n\n");
		
		Calendar agora =  Calendar.getInstance();
		
        System.out.printf("A data corrente é: " + agora.getTime());
        
        agora.add(Calendar.DATE, -15);
        System.out.printf("\n15 dias atrás: " + agora.getTime());
        
        agora.add(Calendar.MONTH, 4);
        System.out.printf("\n4 meses depois: " + agora.getTime());
        
        agora.add(Calendar.YEAR, 2);
        System.out.printf("\n2 anos depois: " + agora.getTime());	
	}
	
	public static void imprimindoDataEmFormatosDiferentes () {
		
		System.out.printf("\n\nimprimindoDataEmFormatosDiferentes():\n\n");
		
		Calendar agora = Calendar.getInstance();
        
        System.out.printf("%tc\n", agora);
        // Dom jul 14 20:58:11 BRT 2019

        System.out.printf("%tF\n", agora);
        // 2019-07-14

        System.out.printf("%tD\n", agora);
        // 07/14/19

        System.out.printf("%tr\n", agora);
        // 09:58:11 PM

        System.out.printf("%tT\n", agora);
	}
	
	public static void simpleDateFormat() {
		
		System.out.printf("\n\nsimpleDateFormat():\n\n");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		
		Date data = new Date();
		System.out.println(data);
		System.out.println(sdf.format(data));
	}
}
