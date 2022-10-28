package atividades28_10;

import java.util.Scanner;

public class questão1 {

	public static void main(String[] args) {
		
		boolean booleano= false;
		int inteiro = 0, verificador;
		long longo= 0;
		short curto= 0;
		double dobro= 0;
		byte bytes= 0;
		char caracter = 0;
		float flutuar= 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual tipo de variável você quer?\n\n1 - boolen\n2 - int\n3 - long\n4 - short\n5 - double\n6 - byte\n7 - char\n8 - float\n");
		verificador = teclado.nextInt();
		
		if (verificador == 1) {
			System.out.print("Insira um valor para boolean: ");
			booleano = teclado.nextBoolean();
			System.out.print(booleano);
		}
		else if(verificador == 2) {
			System.out.print("Insira um valor para int: ");
			inteiro = teclado.nextInt();
			System.out.print(inteiro);
		}
		else if(verificador == 3) {
			System.out.print("Insira um valor para long: ");
			longo = teclado.nextLong();
			System.out.print(longo);
		}
		else if(verificador == 4) {
			System.out.print("Insira um valor para short: ");
			curto = teclado.nextShort();
			System.out.print(curto);
		}
		else if(verificador == 5) {
			System.out.print("Insira um valor para double: ");
			dobro = teclado.nextDouble();
			System.out.print(dobro);
		}
		else if(verificador == 6) {
			System.out.print("Insira um valor para byte: ");
			bytes = teclado.nextByte();
			System.out.print(bytes);
		}
		else if(verificador == 7) {
			System.out.print("Insira um valor para char: ");
			caracter = teclado.next().charAt(0);
			System.out.print(caracter);
		}
		else if(verificador == 8) {
			System.out.print("Insira um valor para float: ");
			flutuar = teclado.nextLong();
			System.out.print(flutuar);
		}
	}

}
