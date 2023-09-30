package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Retangulo;
import entities.Shape;
import entities.enums.Color;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			System.out.print("Rectangle or Circle? r/c: ");
			char ch = sc.next().charAt(0);
			System.out.print("RED/BLUE/GREEN? ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				list.add(new Retangulo(color, altura, largura));
			}else if(ch == 'c') {
				System.out.print("Qual o  raio? ");
				double raio = sc.nextDouble();
				list.add( new Circulo(color, raio) );
			}
		}
		System.out.println();
		System.out.println("SHAPES");
		for(Shape shape: list) {
			System.out.println(String.format("%.2f",  shape.area()));
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
