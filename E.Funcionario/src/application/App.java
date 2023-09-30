package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.Funcionario;
import entities.HoraContrato;
import enums.NivelFuncionario;

public class App {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do trabalhador: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nomeTrabalhador, NivelFuncionario.valueOf(nivelTrabalhador),salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos você tem?");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Entre com a #"+i+" data: ");
			System.out.print("dd/MM/YYYY ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora? ");
			double valorHr = sc.nextDouble();
			System.out.print("Duração do contrato? ");
			int duracao = sc.nextInt();
			
			HoraContrato hrContrato = new HoraContrato(contractDate, valorHr, duracao);
			funcionario.addContrato(hrContrato);
		}
		System.out.println();
		System.out.print("Entre com o mês e o ano para calcular o salário: ");
		String mesEAno = sc.next();
		
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome do trabalhador: "+funcionario.getNome());
		System.out.println("Departamento: "+funcionario.getDepartamento().getNome());
		System.out.println("Ganhos: "+mesEAno+": "+String.format("%.2f ", funcionario.income(ano, mes)));
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
