package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import registros.RegistrosQuartos;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RegistrosQuartos [] estudantes = new RegistrosQuartos[10];
		
		System.out.println("Quantos estudantes?");
		int n = sc.nextInt();
				
		for(int i =1; i<=n; i++) {
				System.out.println();
				System.out.println("Quarto "+i+": ");
				System.out.print("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();					
				System.out.print("Email: ");
				String email = sc.next();				
				System.out.print("Numero do quarto: ");
				int quarto = sc.nextInt();
				estudantes[quarto] = new RegistrosQuartos(name, email);
			}		
		
		System.out.println();
		System.out.println("Ocupação total: ");
		
		for(int i =0; i<10; i++) {
			if(estudantes[i]!=null) {
			System.out.println(i + ": "+estudantes[i]);
			}
		}		
		
		sc.close();
		
	}

}
