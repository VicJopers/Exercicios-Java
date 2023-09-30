package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinesAccount;
import entities.SavesAccount;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account(1001, "Alex", 1000.0);	
		acc.withDraw(200.0);
		System.out.println(acc.getBalance());
		
		Account sv = new SavesAccount(5000, "Ster", 2000.0, 0.01);
		sv.withDraw(200.0);
		System.out.println(sv.getBalance());
		
		Account accs = new BusinesAccount(2000, "Homero", 1000.0, 500.0);
		accs.withDraw(200.0);
		System.out.println(accs.getBalance());
		
		
		BusinesAccount bacc = new BusinesAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinesAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavesAccount(1004, "Peter", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinesAccount acc4 = (BusinesAccount) acc2;
		acc4.loan(100);
		
		//O PRIMEIRO IF VAI FALHAR PORQUE NÃO É UMA INSTANCIA DE BUSINESACCOUNT
		
		if(acc3 instanceof BusinesAccount) {
			BusinesAccount acc5 = (BusinesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavesAccount) {
			SavesAccount acc5 = (SavesAccount)acc3;
			acc5.upDateBalance();
			System.out.println("update!");
		}
		
		if(acc2 instanceof BusinesAccount) {
			BusinesAccount acc5 = (BusinesAccount)acc2;
			acc5.deposit(500.0);
			System.out.println("Deposit!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
