package AvFormativaLPA;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double num1,num2,soma,subtracao,multiplicacao;
		String operacao;
		
		System.out.println ("Informe o primeiro número: ");
		num1= ler.nextDouble();
		
		System.out.println ("Informe o segundo número:  ");
		num2 = ler.nextDouble();
		
		System.out.println ("Qual operação deseja visualizar? + ou - ou *:  ");
		operacao=ler.next();
		
		if (operacao.equals("+")) {
			soma = num1+num2;   
		  System.out.println ("O resultado da soma é:  " + soma);
		}
		
		else if (operacao.equals("-")) {
			subtracao = num1-num2;
			System.out.println ("O resultado da subtração é: " + subtracao);
		}
		else {
			multiplicacao = num1*num2;
			System.out.println ("O resultado da multiplicação é: " + multiplicacao);
		}
        
        
        ler.close();
	}

}
