package AvFormativaLPA;

public class Desafio04 {

	public static void main(String[] args) {
		int bingo[] = new int[20];

		for (int i=0; i<20;i++) {

			bingo[i]= (int) Math.round(Math.random()*100);
		}

			for (int i=0; i<20;i++) {
				System.out.println("Os números sortidos são: " + bingo[i]);


			}
		}
	}


