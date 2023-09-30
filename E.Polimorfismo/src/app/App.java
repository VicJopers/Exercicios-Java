package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceirizado;

public class App {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Qual o número de funcionários? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			System.out.println("Dados do #"+i+" funcionário: ");
			System.out.print("Seu funcionário é terceiriizado? y/n");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.next();
			String nome = sc.nextLine();
			System.out.print("Digite o número de horas: ");
			double hour = sc.nextDouble();
			System.out.print("Digite o valor por hora: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch=='y') {
				System.out.print("Digite o valor adicional: ");
				double valorAdicional = sc.nextDouble();
				Funcionario fun = new Terceirizado(nome, hour, valuePerHour, valorAdicional);
				list.add(fun);
			}else {
				Funcionario fun = new Funcionario(nome, hour, valuePerHour);
				list.add(fun);
			}	
		}
		
		System.out.println("PAYMENTS");
		System.out.println();
		for(Funcionario fun: list) {
			System.out.println(fun.getName()+"-----"+ String.format("%.2f", fun.payment()));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
