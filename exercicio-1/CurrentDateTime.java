package br.ufrpe.bsi.mpoo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
	public static void main(String[] args) {  
	    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
	    Date date = new Date();  
	    
	    HelloWorld helloWorld6 = new HelloWorld();
		helloWorld6.setNome("Lula Molusco");
	    
	    System.out.printf(formatter.format(date).toString() + " - Olá, %s! Você acabou de fazer seu primeiro Hello World em Java. Bob Esponja deve estar orgulhoso.", (helloWorld6.getNome()));  
	}  
}
