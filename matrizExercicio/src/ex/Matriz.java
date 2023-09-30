package ex;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int [][] mat = new int[a][b];
		
		for(int i =0; i<a; i++) {
			for(int j =0; j<b; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int ma = mat[0][0];
		
		for(int i =0; i<a; i++) {
			for(int j =0; j<b; j++) {
				if(mat[i][j]>ma) {
					ma = mat[i][j];
				}
			}
			System.out.println(ma);
		}
		
		sc.close();
	}

}
