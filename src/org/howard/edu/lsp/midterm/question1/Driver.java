package org.howard.edu.lsp.midterm.question1;

public class Driver {
	public static void main(String[] args) {
		String input = "I love CSCI363";
		String encryptedText = SecuirtyOps.encrypt(input);
		System.out.println(encryptedText);
	}
}
