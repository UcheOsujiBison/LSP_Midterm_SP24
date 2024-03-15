package org.howard.edu.lsp.midterm.question1;

public class SecuirtyOps {
	/**
	 * Encrypts a string with odd-index characters following the even-indexed characters,
	 * ignoring any punctuation and whitespace.
	 * 
	 * @param text the text to encrypt
	 * @return The encrypted string
	 * 
	 * */
	public static String encrypt(String text) {
		if (text == null || text.isEmpty()) {
			return "";
		}
		
		// Using the StringBuilder class to manipulate the string
		StringBuilder encryptedText = new StringBuilder();
		StringBuilder evenCharacters = new StringBuilder();
		StringBuilder oddCharacters = new StringBuilder();
		
		// Separating the evenChars and oddChars
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				if (i % 2 == 0) {
					evenCharacters.append(ch);
				} else {
					oddCharacters.append(ch);
				}
			}
		}
		
		// Appending the evenChars followed by the oddChars
		encryptedText.append(evenCharacters).append(oddCharacters);
		return encryptedText.toString();
	}
}
