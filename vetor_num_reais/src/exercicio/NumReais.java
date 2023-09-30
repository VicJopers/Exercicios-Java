package exercicio;

import java.util.Locale;
import java.util.Scanner;

class NumReais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros vai digitar?");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		System.out.println("Digite os valores");
		
		for(int i=0;i<n;i++) {
			vet[i] = sc.nextDouble();
		}
		System.out.print("Exibindo valores digitados: ");
		
		for(int i=0; i<n;i++) {
			System.out.printf("%.1f ",vet[i],"\n");
		}
		double sum =0;
		double media = 0;
		
		for(int i=0; i<n;i++) {
			sum += vet[i];
		}
		
		media = sum/n;
		
		System.out.println(" ");
		System.out.printf("A soma de todos os vetores é: %.2f%n",sum);
		System.out.printf("A media de todos os vetores é: %.2f%n",media);
		
		sc.close();
	}

}
