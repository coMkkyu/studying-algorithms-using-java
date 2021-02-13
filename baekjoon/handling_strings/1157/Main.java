package _1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] check = new int[26];
		int max = 0;
		char result = '?';
		
		// 65~90 ASCII -> A~Z
		for (byte b : br.readLine().toUpperCase().getBytes()) {
			check[b-65]++;
			if(check[b-65] > max) {
				max = check[b-65];
				result = (char)b;
			} else if(max == check[b-65]) {
				result = '?';
			}
		}
		
		System.out.print(result);
	}

}
