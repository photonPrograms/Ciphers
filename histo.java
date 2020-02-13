/* to create a letter frequency histogram
 * to analyze and decrypt a Caesar cipher
 * */
import java.io.*;
public class histo {
	String ciph;
	char arr[] = new char[26];
	int count[] = new int[26];
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader buf = new BufferedReader(reader);

	public void input() throws IOException {
		System.out.println("Enter the cipher to be analyzed.");
		ciph = buf.readLine();
		char ch = 'a';
		for (int i = 0; i < 26; i++) {
			arr[i] = ch;
			count[i] = 0;
			ch++;
		}
	}

	public void analyze() {
		for (int i = 0; i < ciph.length(); i++)
			for (int j = 0; j < 26; j++)
				if (arr[j] == ciph.charAt(i))
					count[j]++;
	}

	public void output() {
		int i, j;
		for (i = 0; i < 26; i++) {
			System.out.print(arr[i] + ":  ");
			for (j = 1; j <= count[i]; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	public static void main(String[] args) throws IOException {
		histo obj = new histo();
		obj.input();
		obj.analyze();
		obj.output();
	}
}
