package TreinandoEntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosPart1e2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		//System.out.println("Digite seu nome: ");
		char x;
		x = sc.next().charAt(0);
		System.out.println(x);
		sc.close();
	}
}
