import java.util.Scanner;

public class SensoCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo=0;
		int alcool =0, gasolina =0, etanol =0;
		
		System.out.println("Informe qual o seu tipo de combustível preferido. \n 1: alcool\n 2: Gasolina \n 3: Etanol\n 4: Sair.");
		while(tipo!=4) {
			
			 tipo = sc.nextInt();
			 if(tipo==1) {
				 System.out.println("Alcool");
				 alcool+=1;
			 }else if(tipo ==2) {
				 System.out.println("Gasolina");
				 gasolina+=1;
			 }else if(tipo ==3) {
				 System.out.println("Etanol");
				 etanol+=1;
			 }else if(tipo==4){
				 System.out.println("Obrigado por votar");
			 }
		}
		System.out.println("Resultado da pesquisa: Alcool: "+alcool+" Gasolina: "+gasolina+" Etanol: "+etanol);
		sc.close();
	}

}
