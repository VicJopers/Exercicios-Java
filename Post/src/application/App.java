package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comentario;
import entities.Postagem;

public class App {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Have a nice trip");
		Comentario c2 = new Comentario("Segundo texto");
		Postagem p1 = new Postagem(sdf.parse("21/06/2018 15:05:06"), 
				"Traveling to New Zeland", 
				"i'm going to visit this wonderful country", 
				15);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
			
		
	}

}
