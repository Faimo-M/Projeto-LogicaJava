package pct1;

import java.util.Scanner;
public class PrimerioExercicio {

	public static void main(String[] args) {
		//Faça um algoritmo que leia dois números 
		//A e B e imprima o maior deles.
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o primeiro numero");
		int a = scan.nextInt();
		System.out.println("digite o segundo numero");
		int b = scan.nextInt();
		
		if(a > b) {
			System.out.println("o numero: "+ a + "eh maioor que "+b);
		}
		else if(b>a){
			System.out.println("o numero: "+ b + "eh maioor que "+a);
		}
		
		else {
			System.out.println("os numeros sao iguais");
		}
		
		
	}

}
