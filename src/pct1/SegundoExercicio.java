package pct1;

import java.util.Scanner;
public class SegundoExercicio {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição: 
• “F1”, se N <= 10 
• “F2”, se N > 10 e N <= 100 
• “F3”, se n > 100
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = scan.nextInt();
		
		if(n <= 10) {
			System.out.println(" F1 ");
		}
		else if( n > 10 && n <= 100) {
			System.out.println("F2");
		}
		
		else if(n > 100) {
			System.out.println("F3");
		}
		
		
	}

}
