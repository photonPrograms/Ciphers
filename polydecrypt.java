/* to decrypt a polyalphabetic cipher
 * given the encrypting word
 */

import java.io.*;
public class polydecrypt {
	String str, word;
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader buf = new BufferedReader(reader);
	
	public void input() throws IOException {
		System.out.println("Enter the cipher to be decrypted.");
		str = buf.readLine();
		System.out.println("Enter the encrypting word.");
		word = buf.readLine();
	}

	public void decrypt() {
		int l = word.length(), rem, i = 0, shift;
		char ch;
		String outstr = "";
		while (i < str.length()) {
			rem = i % l;
			ch = str.charAt(i);
			shift = word.charAt(rem) - 'a' + 1;
			ch -= shift;
			if (ch < 'a')
				ch += 26;
			outstr = outstr + ch;
			i++;
		}
		System.out.println(outstr);
	}

	public static void main(String args[]) throws IOException {
		polydecrypt obj = new polydecrypt();
		obj.input();
		obj.decrypt();
	}
}
