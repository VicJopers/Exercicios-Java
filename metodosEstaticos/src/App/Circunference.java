package App;
import Util.Backdoor;

import java.util.Locale;
import java.util.Scanner;

class Circunference {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Backdoor calc = new Backdoor();
	
	System.out.println("Digite o valor do raio");
	double raio = sc.nextDouble();
	
	double c = calc.circunference(raio);
	double v = calc.volume(raio);
	
	System.out.printf("A circunferencia é: %.2f%n",c);
	System.out.printf("A volume é: %.2f%n",v);
	System.out.printf("A de PI é: %.2f%n",calc.PI);
	
	sc.close();
	
	}
}
