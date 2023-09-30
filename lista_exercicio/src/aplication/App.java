package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Back;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Back> list = new ArrayList<>();
		
		System.out.println("Digite o numero de funcionarios ");
		int n = sc.nextInt();
		
		for(int i=0; i<=n;i++) {
			System.out.println("Funcionário "+(i+1)+": ");
			System.out.println();
			System.out.print("Digite seu ID: ");
			Integer id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("id invalido, digite outro");
				id = sc.nextInt();
			}
			System.out.print("Digite seu nome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Digite seu salario: ");
			Double salario = sc.nextDouble();
			Back funcionario = new Back(id, nome, salario);
			
			list.add(funcionario);
		
		}
		
		System.out.println("Digite o id do funcionario que reberá aumento: ");
		int idSalary = sc.nextInt();
		Back funcionario = list.stream().filter(x -> x.getId()==idSalary).findFirst().orElse(null);
		if(funcionario == null) {
			System.out.println("Não existe");
		}else {
			System.out.print("Digite o valor");
			double percent = sc.nextDouble();
			funcionario.aumentoSalario(percent);
		}
		
		System.out.println("Total de funcionarios na lista: ");
		System.out.println();
		for(Back z: list) {
			System.out.println(z);
		}	
		sc.close();
	}
	
	static Integer position (List<Back> list, int id) {
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Back> list, int id) {
		Back funcionario = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return funcionario != null;
	}

}
