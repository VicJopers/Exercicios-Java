package escolha;

import java.util.Scanner;

public class EscolhaCaso {
	public static void main(String[] args) {
		int a, b, x, r;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		System.out.println("Qual operação deseja realizar? ");
		x = sc.nextInt();
		
		switch (x) {
		case 1:
			r = a+b;
			System.out.println(r);
			break;
		case 2:
			r = a-b;
			System.out.println(r);
			break;
		default:
			s = "Valor invalido";
		}
	}

}
