package br.coppetec.processos;

import java.util.Date;

public class Exemplo001 {
	
      public static void main(String[] args) {
    	  
              Long currentTimeMillis = 	System.currentTimeMillis();	//	System.currentTimeMillis**();**
              
              System.out.println(currentTimeMillis);
              // 1617752114615

              Date novaData = new Date(currentTimeMillis);
      
              System.out.println(novaData); // Tue Apr 06 20:36:02 BRT 2021
      } 
}