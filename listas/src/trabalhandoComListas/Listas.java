package trabalhandoComListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	public static void main(String[] args) {
		//TRABALHANDO COM LISTAS
		List<String> list = new ArrayList<>();
		list.add("Marco");
		list.add("Marcia");
		list.add("Alex");
		list.add("Joca");
		list.add("Alexandra");
		list.add(2, "Jax");
		//list.remove(1);
		
		for(String listinha: list) {
			System.out.println(listinha);
		}
		//System.out.println("-----------------------------");
		//PARA REMOVER UM CARACTERE ESPECÍFICO DA LISTA JUNTAMENTE COM A PALAVRA
		System.out.println("APENAS PALAVRAS SEM A LETRA M");
		list.removeIf(listinha -> listinha.charAt(0)=='J');
		for(String listinha: list) {
			System.out.println(listinha);
		}
		System.out.println("Apenas palavras com a letra M");
		List<String> filtragem = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String f: filtragem) {
			System.out.println(f);
		}
		System.out.println("Retornando um nome ou nulo");
		String name = list.stream().filter(y -> y.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
}
}
