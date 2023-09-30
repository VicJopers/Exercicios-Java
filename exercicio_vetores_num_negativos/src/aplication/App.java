package aplication;

import java.util.Locale;
import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor n");
		int n = sc.nextInt();
		int [] vet = new int[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("Digite um valor inteiro");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS");
		
		for(int i=0;i<n;i++) {
			if(vet[i]<0&&vet[i]>-10) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}
}
