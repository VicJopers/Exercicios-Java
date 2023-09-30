import java.util.Scanner;

public class TreinoEnquanto {
	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int soma=0;
		while(x!=0) {
			x=sc.nextInt();
			soma +=x;
		}
		System.out.println(soma);
	}

}
