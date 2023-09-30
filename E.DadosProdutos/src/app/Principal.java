package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProducts;
import entities.Product;
import entities.UsedProducts;

public class Principal {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com o número de produtos");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			System.out.println("Product #"+ n+ " data: ");
			System.out.print("Comum, usado ou importado? c/u/i");
			char ch = sc.next().charAt(0);
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Taxa de importação ");
				double customsFree = sc.nextDouble();
				ImportedProducts importado = new ImportedProducts(name, price, customsFree);
				list.add(importado);
			}else if(ch == 'u') {
				System.out.print("Digite a data de importação: (DD/MM/YYYY) ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProducts(name, price, date));
			}else if(ch=='c') {
				list.add(new Product(name, price));
			}
			
			System.out.println();
			System.out.println("ETIQUETAS");
			for(Product p: list) {
				System.out.println(p.priceTag());
			}
		}
	
		
		sc.close();
	}

}
