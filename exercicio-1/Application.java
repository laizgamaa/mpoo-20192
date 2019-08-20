package br.ufrpe.bsi.mpoo;

public class Application {
	public static void main(String[] args) {
		String helloWorld = "Hello world";
		System.out.println(helloWorld);
		
//		Feito em sala
		
		HelloWorld helloWorld3 = new HelloWorld();
		helloWorld3.setNome("Laiz");
		System.out.println(helloWorld3.getNome()); 
		
		HelloWorld helloWorld4 = new HelloWorld();
		helloWorld4.setNome("Arthur");
		System.out.println(helloWorld4.getNome());
		
//		Feito no exercício
		
		HelloWorld helloWorld5 = new HelloWorld();
		helloWorld5.setNome("Bob Esponja");
		System.out.println(helloWorld5.getNome());
		
		HelloWorld helloWorldFulano = new HelloWorld();
		System.out.println(helloWorldFulano.getNome());
	}

}

