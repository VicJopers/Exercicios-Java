package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Produtos;
import enums.OrderStatus;


public class App {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Qual o seu nome? ");
		String name = sc.nextLine();
		System.out.print("Digite seu email: ");
		String email = sc.nextLine();
		System.out.print("Digite sua data de aniversário no formato dd/MM/yyyy: ");
		Date birthDate = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(name, email, birthDate);
		
		System.out.println();
		System.out.println("ENTER ORDER DATA:");
		System.out.println("status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.print("Quantos itens vai querer? ");
		int numItens = sc.nextInt();
		
		for(int i =0; i<=numItens; i++) {
			System.out.println("Digite o #"+(i+1)+" item: ");
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("preço: ");
			double preco = sc.nextDouble();
			
			Produtos produto = new Produtos(nome, preco);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			OrderItem orderitem = new OrderItem(quantidade, preco, produto);
			
			order.AddItem(orderitem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
			
		
		sc.close();
	}

}
