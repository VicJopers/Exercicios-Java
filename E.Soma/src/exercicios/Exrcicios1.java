package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exrcicios1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		double salario = 0, totalVendasEfetuadas = 0;
		
		System.out.println("Digite seu nome");
		nome = sc.next();
		System.out.println("Digite seu salario");
		salario = sc.nextDouble();
		System.out.println("Digite o total de vendas realizadas");
		totalVendasEfetuadas = sc.nextDouble();
		
		double percent = 15.0/100;
		double valorFinal=percent*totalVendasEfetuadas;
		
		double salarioFimDoMes = salario+valorFinal;
		
		
		System.out.printf("Total: %.2f%n",salarioFimDoMes);
		
		
		
		
		
		
	}

}
