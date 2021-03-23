package curso_programacao;

import java.util.Scanner;

public class scanner_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0 , y = 0;
					
		int resultado = 0;
		System.out.println("Digite dois numeros");
		x = sc.nextInt();
		y = sc.nextInt();
		resultado = x + y;
		System.out.println("voce digitou " + x);
		System.out.println("voce digitou " + y);
		System.out.println("Soma " + resultado);
		sc.close();
	}

}
