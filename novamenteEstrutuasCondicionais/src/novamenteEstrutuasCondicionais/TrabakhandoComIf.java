package novamenteEstrutuasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class TrabakhandoComIf {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//int a, b;
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Insira o primeiro valor");
		//a = sc.nextInt();
		//System.out.println("Insira segundo valor");
		//b = sc.nextInt();
		
		//if(a%b==0 || b%a==0) {
		//	System.out.println("É multiplo");
		//}else {
		//	System.out.println("N é");
		//}
		
		// CALCULAR TEMPO DE UM JOGO
		
		//int hrInicial, hrFinal, duracao;
		//hrInicial= sc.nextInt();
		//hrFinal= sc.nextInt();
		//if(hrInicial<hrFinal) {
		//	duracao = hrInicial-hrFinal;
		//}else {
		//	duracao = 24-hrInicial+hrFinal;
		//}
		//System.out.println("O jogo durou "+duracao);
		
		int q, cod, a=1, b=2, c=3, d=4, e=5;
		
		System.out.println("Qual o codigo do seu item? ");
		cod = sc.nextInt();
		if(cod==1) {
			System.out.println("Cachorro quente, quantos vai querer? ");
			q=sc.nextInt();
			System.out.printf("Em breve seu pedido de %d cachorros quentes ficará pronto", q+"%n");
			double preco = 4.00;
			double valorTotal = preco*q;
			System.out.println("Valor total: "+valorTotal);
		}else if(cod==2) {
			System.out.println("X-Salada, quantos vai querer? ");
			q=sc.nextInt();
			System.out.printf("Em breve seu pedido de %d X-salada ficará pronto ", q,"%n");
			double preco = 4.50;
			double valorTotal = preco*q;
			System.out.println("Valor total: "+valorTotal);
		}
		
		sc.close();
	}

}
