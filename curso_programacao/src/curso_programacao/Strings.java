package curso_programacao;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = " aaatetsts Java CFVA -   ";
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.replace('a','x');
		
		System.out.println("Valor Original Lower " + s1 + "-");
		System.out.println("Valor Original upper " + s2 + "-");
		System.out.println("Valor Original trim " + s3 + "-");
		System.out.println("Valor Original substring " + s4 + "-");
		System.out.println("Valor Original substring " + s5 + "-");
	}

}
