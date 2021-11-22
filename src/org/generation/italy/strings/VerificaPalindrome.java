package org.generation.italy.strings;
import java.util.Scanner;

public class VerificaPalindrome {
	public static void main(String[] args) {
		
		System.out.print("Inserisci una parola: ");
		Scanner scanner = new Scanner(System.in);
		String parola = scanner.nextLine();
		String parolaPalindroma = "";
		char c;
		int length = parola.length();
		
		for(int i = 0; i < parola.length(); i++) {
			c = parola.charAt(i); 
			parolaPalindroma = c + parolaPalindroma;
		}
		if (parola.equals(parolaPalindroma)) {
			System.out.println("E' una parola palindroma");
			
		} else {
			System.out.println("Non è una parola palindroma");
		}
		System.out.println("la parola è lunga: " + length + " caratteri");
		
		scanner.close();
	}

}
