package exercicioSwithCase;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o plano: \nBASIC - PREMIUM - GOLD");
		String plano = sc.next().toUpperCase();
		if (plano.equalsIgnoreCase("basic") || plano.equalsIgnoreCase("premium") || plano.equalsIgnoreCase("gold")) {
			switch (plano) {
			case "BASIC":
				System.out.println("Plano basic: 200min liga��es");
				break;
			case "PREMIUM":
				System.out.println("Plano Premium: 200min liga��es + 3g internet");
				break;
			case "GOLD":
				System.out.println("Plano Gold: 200min liga��es + 3g internet + facebook ilimitado");

			}

		} else {
			System.err.println("ERRO! VOC� COLOCOU DADOS INV�LIDOS");
		}
	}

}