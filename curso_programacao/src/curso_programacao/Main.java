package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 4;
		double x = 10.345;
		String nome = "Maria";
		
		System.out.println("N�mero � " + y);
		System.out.println("N�mero � " + x);
		System.out.printf("%.2f%n" , x);
		System.out.printf("%.4f%n" , x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n" , x);
		System.out.println("N�mero � " + nome);
	}

}
