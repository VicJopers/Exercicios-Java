package exercicio;

import java.util.Locale;
import java.util.Scanner;
import objeto.Altura;

class VetAlturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas?");
		int n = sc.nextInt();
		Altura[] vet = new Altura[n];
		
		int idade = 0;
		int menores = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite seu nome");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.println("Digite sua altura");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.println("Digite sua idade");
			idade = sc.nextInt();
			vet[i] = new Altura(nome, altura, idade);
		}
		
		for(int i =0; i<n; i++) {
			if(idade<=16) {
				menores++;
			}
		}
		double perctMenores = (menores/n)*100;
		
		double media = 0.0;
		for(int i = 0; i<n; i++) {
			media += (vet[i].getAltura()/n);
		}
		
		
		System.out.printf("A media das altuas é: %.2f%n",media);
		System.out.printf("O percentual de menores é: %.1f%n",perctMenores);
		
		for(int i =0; i<n; i++) {
			if(idade<=16) {
				System.out.printf("%.1f%n ",vet[i].getNome());
			}
		}
		
		sc.close();
	}

}
