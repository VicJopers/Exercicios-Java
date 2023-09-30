package main;

import java.util.Locale;
import java.util.Scanner;

class Vetores {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		int n = sc.nextInt();
		double [] vet = new double [n];
		
		for(int i=0; i<n;i++) {
			vet[i] = sc.nextDouble();
			sum +=vet[i];
		}
		
		double media = sum/n;
		
		System.out.printf("O total de vetores é: %.2f%n",media);
		
		sc.close();
	}

}
