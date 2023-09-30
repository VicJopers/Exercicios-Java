package App;

import java.util.Locale;
import java.util.Scanner;
import Util.CalcDoll;

public class Aplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalcDoll calc = new CalcDoll();
		
		System.out.println("Qual a cotação do dollar? ");
		double cotDol = sc.nextDouble();
		System.out.println("Quantos dolares planeja comprar? ");
		double cp = sc.nextDouble();
		
		double result = calc.custoEmReais(cotDol, cp);
		
		System.out.println("O valor total em reais é de: "+result+" e com a taxa de IOF fica: "+calc.iof(result));
		
		
		sc.close();
		
	}

}
