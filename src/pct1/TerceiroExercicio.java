package pct1;

import java.util.Scanner;
public class TerceiroExercicio {

	public static void main(String[] args) {
		/*Construa um algoritmo que receba
		 *  como entrada três valores e os imprima em ordem crescente.*/

	Scanner scan = new Scanner(System.in);
	System.out.println("digite o primeiro numero: ");
	int num1 = scan.nextInt();
	System.out.println("digite o segundo numero: ");
	int num2 = scan.nextInt();
	System.out.println("digite o terceiro numero: ");
	int num3 = scan.nextInt();
	int menor = 0;
	int med = 0;
	int maior = 0;
	
	if (num1 <= num2 && num1 <= num3) {
	    menor = num1;
	    if (num2 <= num3) {
	        med = num2;
	        maior = num3;
	    } else {
	        med = num3;
	        maior = num2;
	    }
	    System.out.println("Ordem crescente: " + menor + ", " + med + ", " + maior);

	}
	}
	}



