package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Taxa;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Taxa> list = new ArrayList<>();
		
		System.out.println("Quantas empresas vai cadastrar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			System.out.println("Pessoa física ou jurídica? f/j");
			char ch = sc.next().charAt(0);
			System.out.print("Nome da empresa:  ");
			String nome = sc.next();
			System.out.println("Renda anual:  ");
			double renda = sc.nextDouble();
			if(ch =='f') {
				System.out.println("Quanto gastou com saúde? ");
				double saude = sc.nextDouble();
				list.add( new PessoaFisica(nome, renda, saude) );
			}else if(ch == 'j') {
				System.out.println("Número de funcionários:  ");
				int num = sc.nextInt();
				list.add( new PessoaJuridica(nome, renda, num) );
			}
		}
		
		System.out.println();
		System.out.println("RESUMO");
		
		double sum = 0.0;
		double soma = 0.0;
		
		for(Taxa t: list) {
			double taxa = t.tax();
			System.out.println("Nome: "+ t.getNome()+ " Renda: "+ String.format("%.2f", t.tax() ));
			sum+=taxa;
			soma += t.tax();
		}
		
		System.out.println("RESUMO TAXA TOTAL");
		System.out.println(String.format("%.2f", soma));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
