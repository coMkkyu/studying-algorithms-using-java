package _5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int min = 0;
		
		for (int i = 0; i < word.length(); i++) {
			switch (word.charAt(i)) {
			case 'A': case 'B': case 'C':
				min += 3;
				break;
			case 'D': case 'E': case 'F':
				min += 4;
				break;
			case 'G': case 'H': case 'I':
				min += 5;
				break;
			case 'J': case 'K': case 'L':
				min += 6;
				break;
			case 'M': case 'N': case 'O':
				min += 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				min += 8;
				break;
			case 'T': case 'U': case 'V':
				min += 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				min += 10;
				break;
			}
		}
		
		System.out.println(min);
	}

}
