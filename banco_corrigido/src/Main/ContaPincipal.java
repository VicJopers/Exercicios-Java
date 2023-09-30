package Main;

import java.util.Locale;
import java.util.Scanner;

import app.ContaUsuario;

class ContaPincipal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaUsuario user;
		
		System.out.print("Enter account number: ");
		int number1 = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			user = new ContaUsuario(number1, holder, initialDeposit);	
		}
		else {
			user = new ContaUsuario(number1, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		user.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		user.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(user);
		sc.close();
	}

}
