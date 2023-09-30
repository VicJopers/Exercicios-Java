package exercicio;

import java.util.ArrayList;
import java.util.List;

public class ExercicioArray {
	public static void main(String[] args) {
		
		List<String> car = new ArrayList<>();
		
		car.add("Azul");
		car.add("Preto");
		car.add("Verde");
		car.add(2, "Cromado");
		
		for(String x: car) {
			System.out.println(x);
		}
	}

}
