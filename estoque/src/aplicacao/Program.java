package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Product;

class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o nome do produto ");
		String name = sc.nextLine();
		
		System.out.println("Digite o valor do produto ");
		double price = sc.nextDouble();
		
		System.out.println("Digite a quantidade ");
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price, quantity);
		
		System.out.println("Product data "+produto);
		
		System.out.println(" ");
		System.out.println("Selecione o numero de produtos a ser adicionado ");
		quantity = sc.nextInt();
		produto.addProduct(quantity);
		System.out.println("Update data "+produto);
		System.out.println(" ");
		System.out.println("Selecione o numero q ser retirado");
		quantity = sc.nextInt();
		produto.removeQuantity(quantity);
		System.out.println("Update data "+produto);
		
		System.out.println("Atualize o nome do produto: "+produto.getName());
		
		
		System.out.println("Fim do código");
		
		
		
		sc.close();
	}

}
