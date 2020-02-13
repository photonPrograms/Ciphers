/* to decrypy letters
 * involving the Caesar cipher shift
 */

import java.io.*;
public class shifter {
	String str;
	int shift;
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader buf = new BufferedReader(reader);

	public void input() throws IOException {
		System.out.println("Enter the string.");
		str = buf.readLine();
		System.out.println("Enter the Caesarian shift.");
		shift = Integer.parseInt(buf.readLine());
	}

	public void output() {
		String outstr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			ch -= shift;
			if (ch < 'a')
				ch += 26;
			outstr = outstr + ch;
		}
		System.out.println(outstr);
	}

	public static void main(String[] args) throws IOException {
		shifter obj = new shifter();
		obj.input();
		obj.output();
	}
}
