package AvFormativaLPA;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
	        Scanner ler = new Scanner (System.in);
	        
		 double quadrado,lado;
		
		System.out.println ("Informe o valor de um lado do quadrado regular: ");
		lado = ler.nextDouble();
		quadrado = lado*lado;
		
		System.out.println ("A área do quadrado é: "+ quadrado);
		
		ler.close();
	}

}
