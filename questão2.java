package atividades28_10;

import java.util.Scanner;

public class quest�o2 {

	public static void main(String[] args) {
		
		int numero = 0, maiorNumero = 0, menorNumero = 0, contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (;numero != 0 || contador == 0; contador++) {
			
			System.out.print("\nInsira um n�mero inteiro (digite 0 para encerrar): ");
			numero = teclado.nextInt();
			
			if (numero < 0) {
				System.out.print("\nInsira apenas valores positivos");
			}
			else {
				if (numero > maiorNumero && numero != 0 || contador == 0) {
					maiorNumero = numero;
				}
				if(numero < menorNumero && numero != 0 || contador == 0) {
					menorNumero = numero;
				}
			}
		}
		System.out.print("\nO menor n�mero �: " + menorNumero);
		System.out.print("\nO maior n�mero �: " + maiorNumero);
		
	}

}
